package AnalizadorLexico;

import java.util.Stack;

public class Semantico implements Constants {

    // declarar os registros semanticos como atributos do analisador semantico
    // codigo -> string; StringList, ...
    // pilha_tipos -> Stack
    StringList codigo;
    Stack<String> pilhaTipos;

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        switch (action) {
            case 1:
                acaoSemantica01();
            case 2:
                acaoSemantica02();
            case 3:
                acaoSemantica03();
            case 4:
                acaoSemantica04();
            case 5:
                acaoSemantica05(token);

            default:
                System.out.println("Ação ainda não implementada");
        }

        acaoSemantica01()
        {
            tipo1 = pilhaTipos.pop();
            tipo2 = pilhaTipos.pop();
            // verificar se os tipos estão de acordo com a tabela de tipos
            // se forem incompativis -> gerar exceção 
            // fimse
            // empilhar o tipo resultante
            codigo.add("add");
        }

        acaoSemantica05(token)
        {
            pilhaTipos.push("int64");
            codigo.add("ldc.i8 " + token.getLexeme());
            codigo.add("conv.r8");
        }

    }
}
