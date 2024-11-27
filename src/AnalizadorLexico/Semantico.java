package AnalizadorLexico;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Semantico  {  // implements Constants

    // declarar os registros semanticos como atributos do analisador semantico
    List<String> codigo = new ArrayList<>();
    Stack<String> pilhaTipos;
    String operador_relacional= "";

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        switch (action) {
            case 100:
                acaoSemantica100();
            case 101:
                acaoSemantica101();
            case 108:
                acaoSemantica108();
            case 123:
                acaoSemantica123();
            case 128:
                acaoSemantica128(token);
            case 129:
                acaoSemantica129(token);
            case 130:
                acaoSemantica130(token);
            case 118:
                acaoSemantica118();
            case 119:
                acaoSemantica119();
            case 131:
                acaoSemantica131(token);
            case 124:
                acaoSemantica124();
            case 125:
                acaoSemantica125();
            case 126:
                acaoSemantica126();
            case 121:
                acaoSemantica121(token);
            case 122:
                acaoSemantica122(token);   // fazer o codigo
            case 120:
                acaoSemantica120(token);
            case 116:
                acaoSemantica116(token);
            case 117:
                acaoSemantica117(token);
            default:
                System.out.println("Ação ainda não implementada");
        }

        /*
        
        codigo.add("conv.r8");
        codigo.add("{int64}");
        */
        // no final do il tem um conv.r8 e depois parenteses com int64 
        // que converte o resultado para int64, se for bool ou outro não tem o conv.r8
        // e o item dentro do parenteses vai ser bool por exemplo
    }


    private void acaoSemantica11() {
        pilhaTipos.push("bool");
        codigo.add("ldc.i4.1");
    }

    private void acaoSemantica100() {  // cabeçalho
        codigo.add(".assembly extern mscorlib {}");
        codigo.add("/n");
        codigo.add(".assembly _codigo_objeto{}");
        codigo.add("/n");
        codigo.add(".module _codigo_objeto.exe");
        codigo.add("/n");
        codigo.add(".class public UNICA{");
        codigo.add("/n");
        codigo.add(".method static public void _principal() {");
        codigo.add("/n");
        codigo.add(".entrypoint");
    }

    private void acaoSemantica101() { // finalizar o programa
        codigo.add("ret");
        codigo.add("/n");
        codigo.add("}");
        codigo.add("/n");
        codigo.add("}");
    }

    private void acaoSemantica108() { // <saida> write
        String tipo1 = pilhaTipos.pop();
        
        codigo.add("conv.r8");
        codigo.add("call void\n" + "[mscorlib]System.Console::Write(" + tipo1 +")");
    }

    private void acaoSemantica123() { // soma
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if(tipo1 == "int64" && tipo2 == "int64"){
            pilhaTipos.add("int64");
        }else{
            pilhaTipos.add("float64");
        }
        codigo.add("add");
    }

    private void acaoSemantica128(Token token) { // expressao para constante_int
        pilhaTipos.add("int64");
        codigo.add("ldc.i8 "+token.getLexeme());
        codigo.add("conv.r8");
    }

    private void acaoSemantica129(Token token) { // expressao para constante_float
        pilhaTipos.add("float64");
        codigo.add("ldc.r8 "+token.getLexeme().replace(",", "."));
    }

    private void acaoSemantica130(Token token) { // expressão para constante_string
        pilhaTipos.add("string");
        codigo.add("ldstr "+token.getLexeme());
    }

    private void acaoSemantica118() { // expressão para true
       pilhaTipos.add("bool");
       codigo.add("ldc.i4.1");
    }

    private void acaoSemantica119() { // expressoa para false
        pilhaTipos.add("bool");
       codigo.add("ldc.i4.0");
    }

    private void acaoSemantica124() { // subtração
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if(tipo1 == "int64" && tipo2 == "int64"){
            pilhaTipos.add("int64");
        }else{
            pilhaTipos.add("float64");
        }
        codigo.add("sub");
    }

    private void acaoSemantica125() {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if(tipo1 == "int64" && tipo2 == "int64"){
            pilhaTipos.add("int64");
        }else{
            pilhaTipos.add("float64");
        }
        codigo.add("mul");
    }

    private void acaoSemantica126() {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if(tipo1 == "int64" && tipo2 == "int64"){
            pilhaTipos.add("int64");
        }else{
            pilhaTipos.add("float64");
        }
        codigo.add("div");
    }

    private void acaoSemantica121(Token token) {  // guarda o operador relacional
        operador_relacional = token.getLexeme();
    }

    private void acaoSemantica122(Token token) {  // efetuar ação do operador relacional
        String valor1 = codigo.get(codigo.size()-1);
        String valor2 = codigo.get(codigo.size()-2);
        String operador = operador_relacional;
        if(operador == "ceq"){
            if(valor1 == valor2){
                pilhaTipos.add("true");
            }
        }
    }

    private void acaoSemantica120(Token token) { // operador lógico unário "!"
        codigo.add("ldc.i4.1");
        codigo.add("xor");
    }

   

    
    
    
    
}
