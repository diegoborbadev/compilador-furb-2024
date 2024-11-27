package AnalizadorLexico;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Semantico implements Constants {  // implements Constants

    // declarar os registros semanticos como atributos do analisador semantico
    List<String> codigo = new ArrayList<>();
    Stack<String> pilhaTipos;
    String operador_relacional = "";
    Stack<String> pilhaRotulos;
    List<String> listaIdentificadores = new ArrayList<>();
    List<String> tabelaSimbolos = new ArrayList<>();
    int contRotulo = 1;

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
                acaoSemantica122(token);   // ver se a logica esta correta
            case 120:
                acaoSemantica120(token);
            case 116:
                acaoSemantica116(token); 
            case 117:
                acaoSemantica117(token); 
            case 127:
                acaoSemantica127(token); // lançar erro
            case 107:
                acaoSemantica107(token); // quebra de linha, ver como vamos implementar isso
            case 104:
                acaoSemantica104(token);
            case 102:
                acaoSemantica102(token); // lançar erro
            case 103:
                acaoSemantica103(token);
            case 106:
                acaoSemantica106(token);
            case 105:
                acaoSemantica105(token);
            case 109:
                acaoSemantica109(token);
            case 110:
                acaoSemantica110(token);
            case 111:
                acaoSemantica111(token);
            case 112:
                acaoSemantica112(token);
            case 113:
                acaoSemantica113(token);
            case 114:
                acaoSemantica114(token);
            case 115:
                acaoSemantica115(token);
            default:
                System.out.println("Ação ainda não implementada");
        }

        switch (pilhaTipos.pop()) {
            case "int64":
                codigo.add("conv.r8");
                codigo.add("call void [mscorlib]System.Console::WriteLine(int64)");
                break;
            case "float64":
                codigo.add("call void [mscorlib]System.Console::WriteLine(float64)");
                break;
            case "bool":
                codigo.add("call void [mscorlib]System.Console::WriteLine(bool)");
                break;
            case "string":
                codigo.add("call void [mscorlib]System.Console::WriteLine(string)");
                break;
            default:
                break;
        }
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
        codigo.add("call void [mscorlib]System.Console::Write(" + tipo1 + ")");
    }

    private void acaoSemantica123() { // soma
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if (tipo1 == "int64" && tipo2 == "int64") {
            pilhaTipos.add("int64");
        } else {
            pilhaTipos.add("float64");
        }
        codigo.add("add");
    }

    private void acaoSemantica128(Token token) { // expressao para constante_int
        pilhaTipos.add("int64");
        codigo.add("ldc.i8 " + token.getLexeme());
        codigo.add("conv.r8");
    }

    private void acaoSemantica129(Token token) { // expressao para constante_float
        pilhaTipos.add("float64");
        codigo.add("ldc.r8 " + token.getLexeme().replace(",", "."));
    }

    private void acaoSemantica130(Token token) { // expressão para constante_string
        pilhaTipos.add("string");
        codigo.add("ldstr " + token.getLexeme());
    }

    private void acaoSemantica118() { // expressão para true
        pilhaTipos.add("bool");
        codigo.add("ldc.i4.1");
    }

    private void acaoSemantica119() { // expressoa para false
        pilhaTipos.add("bool");
        codigo.add("ldc.i4.0");
    }

    private void acaoSemantica131(Token token) {  // negação
        codigo.add("ldc.i4.1");
        codigo.add("xor");
    }

    private void acaoSemantica124() { // subtração
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if (tipo1 == "int64" && tipo2 == "int64") {
            pilhaTipos.add("int64");
        } else {
            pilhaTipos.add("float64");
        }
        codigo.add("sub");
    }

    private void acaoSemantica125() { // multiplicação
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if (tipo1 == "int64" && tipo2 == "int64") {
            pilhaTipos.push("int64");
        } else {
            pilhaTipos.push("float64");
        }
        codigo.add("mul");
    }

    private void acaoSemantica126() {   // divisão
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        if (tipo1.equals("int64") && tipo2.equals("int64")) {
            pilhaTipos.push("int64");
        } else {
            pilhaTipos.push("float64");
        }
        codigo.add("div");
    }

    private void acaoSemantica121(Token token) {  // guarda o operador relacional
        operador_relacional = token.getLexeme();
    }

    private void acaoSemantica122(Token token) {  // efetuar ação do operador relacional
        String tipo1 = pilhaTipos.pop(); 
        String tipo2 = pilhaTipos.pop();
        String operador = operador_relacional;
        
        pilhaTipos.push("bool");
        
        if (operador == "ceq") {
            codigo.add("ceq");
        } else if (operador == "cgt") {
            codigo.add("cgt");
        } else if (operador == "clt") {
            codigo.add("clt");
        }
    }

    private void acaoSemantica120(Token token) { // operador lógico unário "!"
        codigo.add("ldc.i4.1");
        codigo.add("xor");
    }

    private void acaoSemantica116(Token token) { // && ou ||
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        codigo.add("and");
        pilhaTipos.add("bool");
    }

    private void acaoSemantica117(Token token) {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();
        codigo.add("or");
        pilhaTipos.add("bool");
    }

    private void acaoSemantica127(Token token) {
        for (int i = 0; i <= tabelaSimbolos.size(); i++) {
            if (tabelaSimbolos.get(i).equals(token.getLexeme())) {
                char tipoToken = token.getLexeme().charAt(0);
                switch (tipoToken) {
                    case 'i':
                        pilhaTipos.add("int64");
                        codigo.add(" ldloc " + token.getLexeme());
                        codigo.add("conv.r8");
                        break;
                    case 'f':
                        pilhaTipos.add("float64");
                        codigo.add(" ldloc " + token.getLexeme());
                        break;
                    case 'b':
                        pilhaTipos.add("bool");
                        codigo.add(" ldloc " + token.getLexeme());
                        break;
                    case 's':
                        pilhaTipos.add("string");
                        codigo.add(" ldloc " + token.getLexeme());
                        break;
                    default:
                        break;
                }
            }
        }
        // encerrar a execução e apontar erro semântico, 
        //indicando a linha e apresentando a mensagem token.getLexeme não declarado 
    }

    private void acaoSemantica107(Token token) { // quebra de linha
        codigo.add("\n");
    }

    private void acaoSemantica104(Token token) {
        listaIdentificadores.add(token.getLexeme());
    }

    private void acaoSemantica102(Token token) {
        for (int i = 0; i <= tabelaSimbolos.size(); i++) {
            if (!tabelaSimbolos.get(i).equals(token.getLexeme())) {
                tabelaSimbolos.add(token.getLexeme());
                char tipoToken = token.getLexeme().charAt(0);
                switch (tipoToken) {
                    case 'i':
                        codigo.add(" .locals(int64) ");
                        break;
                    case 'f':
                        codigo.add(" .locals(float64) ");
                        break;
                    case 'b':
                        codigo.add(" .locals(bool) ");
                        break;
                    case 's':
                        codigo.add(" .locals(string) ");
                        break;
                    default:
                        break;
                }
                listaIdentificadores.clear();
            }
        }
        // se não encontrar no for
        // encerrar a execução e apontar erro semântico, 
        //indicando a linha e apresentando a token.getLexeme já declarado (por exemplo: i_area já declarado);

    }

    private void acaoSemantica103(Token token) {
        String tipo = pilhaTipos.pop();
        if (tipo.equals("int64")) {
            codigo.add("conv.i8");
        }
        for (int j = 0; j <= listaIdentificadores.size() - 1; j++) {
            codigo.add("dup");
            for (int i = 0; i <= tabelaSimbolos.size(); i++) {
                if (tabelaSimbolos.get(i).equals(token.getLexeme())) {
                    codigo.add("stloc " + listaIdentificadores.get(j));
                }
            }
            // se não encontrar na tabela de simbolos
            // encerrar a execução e apontar erro semântico, 
            //indicando a linha e apresentando a token.getLexeme não declarado (por exemplo: i_area não declarado);
        }

        listaIdentificadores.clear();
    }

    private void acaoSemantica106(Token token) {
        codigo.add("ldstr " + token.getLexeme());  // token.getLexeme() ??
        codigo.add("call void [mscorlib]System.Console::Write(string)");
    }

    private void acaoSemantica105(Token token) {
        for (int i = 0; i <= tabelaSimbolos.size(); i++) {
            if (tabelaSimbolos.get(i).equals(token.getLexeme())) {
                char tipoToken = token.getLexeme().charAt(0);
                switch (tipoToken) {
                    case 'i':
                        codigo.add("call string [mscorlib]System.Console::ReadLine()");
                        codigo.add("call int64 [mscorlib]System.Int64::Parse(string)");
                        codigo.add("stloc " + token.getLexeme());
                        break;
                    case 'f':
                        codigo.add("call string [mscorlib]System.Console::ReadLine()");
                        codigo.add("call float64 [mscorlib]System.Double::Parse(string)");
                        codigo.add("stloc " + token.getLexeme());
                        break;
                    case 'b':
                        codigo.add("call string [mscorlib]System.Console::ReadLine()");
                        codigo.add("call bool [mscorlib]System.Boolean::Parse(string)");
                        codigo.add("stloc " + token.getLexeme());
                        break;
                    case 's':
                        codigo.add("call string [mscorlib]System.Console::ReadLine()");
                        codigo.add("stloc " + token.getLexeme());
                        break;
                    default:
                        break;
                }
            }
        }
        // encerrar a execução e apontar erro semântico, 
        //indicando a linha e apresentando a mensagem token.getLexeme não declarado 

    }

    private void acaoSemantica109(Token token) {
        pilhaRotulos.add("novo_rotulo" + contRotulo);
        contRotulo++;
        codigo.add("brfalse novo_rotulo" + contRotulo);
        pilhaRotulos.add("novo_rotulo" + contRotulo);
        contRotulo++;
    }

    private void acaoSemantica110(Token token) {
        //contRotuloDesempilhado
        String rot2 = pilhaRotulos.pop();
        String rot1 = pilhaRotulos.pop();
        codigo.add("br " + rot1);
        pilhaRotulos.add(rot1);

        // rotular a próxima instrução do código objeto com o rótulo desempilhado (código: rotulo_desempilhado2:). 
        codigo.add(rot2 + ":");
    }

    private void acaoSemantica111(Token token) {
        String rot = pilhaRotulos.pop();
        //rotular a próxima instrução do código objeto com o rótulo desempilhado (código: rotulo_desempilhado:). 
        codigo.add(rot + ":");
    }

    private void acaoSemantica112(Token token) {
        codigo.add("brfalse novo_rotulo" + contRotulo);
        pilhaRotulos.add("novo_rotulo" + contRotulo);
        contRotulo++;
    }

    private void acaoSemantica113(Token token) { // antes do repeat
        codigo.add("novo_rotulo" + contRotulo);
        pilhaRotulos.add("novo_rotulo" + contRotulo);
        contRotulo++;
    }

    private void acaoSemantica114(Token token) {
        String rot = pilhaRotulos.pop();
        codigo.add("brtrue " + rot);
    }

    private void acaoSemantica115(Token token) {
        String rot = pilhaRotulos.pop();
        codigo.add(": brfalse " + rot);
    }

}
