package AnalizadorLexico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class Semantico implements Constants {

    private static final String INT_TYPE = "int64";
    private static final String FLOAT_TYPE = "float64";
    private static final String BOOLEAN_TYPE = "bool";
    private static final String STRING_TYPE = "string";

    private StringBuilder codigo;
    private int contadorLabel;
    private String operador;
    private final Stack<String> stackTipo = new Stack<>();
    private final Stack<String> stackLabel = new Stack<>();
    private final List<Token> tokens = new ArrayList<>();
    private final List<String> simbolos = new ArrayList<>();

    public void executeAction(int action, Token token) throws SemanticError {
        switch (action) {
            case 100 -> acaoSemantica100();
            case 101 -> acaoSemantica101();
            case 102 -> acaoSemantica102();
            case 103 -> acaoSemantica103();
            case 104 -> acaoSemantica104(token);
            case 105 -> acaoSemantica105(token);
            case 106 -> acaoSemantica106(token);
            case 107 -> acaoSemantica107();
            case 108 -> acaoSemantica108();
            case 109 -> acaoSemantica109();
            case 110 -> acaoSemantica110();
            case 111 -> acaoSemantica111();
            case 112 -> acaoSemantica112();
            case 113 -> acaoSemantica113();
            case 114 -> acaoSemantica114();
            case 115 -> acaoSemantica115();
            case 116 -> acaoSemantica116();
            case 117 -> acaoSemantica117();
            case 118 -> acaoSemantica118();
            case 119 -> acaoSemantica119();
            case 120 -> acaoSemantica120();
            case 121 -> acaoSemantica121(token);
            case 122 -> acaoSemantica122(token);
            case 123 -> acaoSemantica123();
            case 124 -> acaoSemantica124();
            case 125 -> acaoSemantica125();
            case 126 -> acaoSemantica126();
            case 127 -> acaoSemantica127(token);
            case 128 -> acaoSemantica128(token);
            case 129 -> acaoSemantica129(token);
            case 130 -> acaoSemantica130(token);
            case 131 -> acaoSemantica131();
        }
    }

    private void acaoSemantica102() throws SemanticError {
        for (Token token : tokens) {
            final String id = token.getLexeme();
            final String type;

            final Optional<String> simbol = simbolos.stream()
                    .filter(v -> v.equals(id))
                    .findFirst();

            if (simbol.isPresent()) {
                throw new SemanticError(id + " já declarado", token.getPosition());
            }

            simbolos.add(id);

            if (id.startsWith("i_")) {
                type = INT_TYPE;
            } else if (id.startsWith("f_")) {
                type = FLOAT_TYPE;
            } else if (id.startsWith("s_")) {
                type = STRING_TYPE;
            } else {
                type = BOOLEAN_TYPE;
            }

            codigo.append(String.format(".locals (%s %s)", type, id))
                    .append("\n");
        }

        tokens.clear();
    }

    private void acaoSemantica103() throws SemanticError {
        String expressionType = stackTipo.pop();
        if (expressionType.equals(INT_TYPE)) {
            codigo.append("conv.i8")
                    .append("\n");
        }
        for (Token token : tokens) {
            final String id = token.getLexeme();
            boolean idDeclared = simbolos.contains(id);
            if (!idDeclared) throw new SemanticError(id + " não declarado", token.getPosition());
            codigo.append("stloc")
                    .append(" ")
                    .append(id)
                    .append("\n");
        }
        tokens.clear();
    }

    private void acaoSemantica104(Token token) {
        this.tokens.add(token);
    }

    private void acaoSemantica105(Token token) throws SemanticError {
        String id = token.getLexeme();
        boolean isIdDeclared = simbolos.contains(id);
        if (!isIdDeclared) throw new SemanticError(id + " não declarado", token.getPosition());
        if (id.startsWith("i_")) {
            codigo.append("call string [mscorlib]System.Console::ReadLine()")
                    .append("\n")
                    .append("call int64 [mscorlib]System.Int64::Parse(string)")
                    .append("\n")
                    .append("stloc")
                    .append(" ")
                    .append(id);
        }
        if (id.startsWith("f_")) {
            codigo.append("call string [mscorlib]System.Console::ReadLine()")
                    .append("\n")
                    .append("call float64 [mscorlib]System.Double::Parse(string)")
                    .append("\n")
                    .append("stloc")
                    .append(" ")
                    .append(id);
        }
        if (id.startsWith("s_")) {
            codigo.append("call string [mscorlib]System.Console::ReadLine()")
                    .append("\n")
                    .append("stloc")
                    .append(" ")
                    .append(id);
        }
        if (id.startsWith("b_")) {
            codigo.append("call string [mscorlib]System.Console::ReadLine()")
                    .append("\n")
                    .append("call bool [mscorlib]System.Boolean::Parse(string)")
                    .append("\n")
                    .append("stloc")
                    .append(" ")
                    .append(id);
        }
        this.codigo.append("\n");
    }

    private void acaoSemantica106(Token token) {
        codigo.append("ldstr ").append(token.getLexeme())
                .append("\n")
                .append("call void [mscorlib]System.Console::Write(string)")
                .append("\n");
    }

    private void acaoSemantica108() {
        final String type = stackTipo.pop();

        if (type.equals(INT_TYPE)) {
            codigo.append("conv.i8")
                    .append("\n");
        }

        final String printCommand = String.format("call void [mscorlib]System.Console::WriteLine(%s)", type);
        codigo.append(printCommand)
                .append("\n");
    }

    private void acaoSemantica109() {
        final String label2 = getLabelName();
        stackLabel.push(getLabelName());
        stackLabel.push(label2);

        codigo.append("brfalse")
                .append(" ")
                .append(label2)
                .append("\n");
    }

    private void acaoSemantica110() {
        String label1 = stackLabel.pop();
        String label2 = stackLabel.pop();

        codigo.append("br")
                .append(" ")
                .append(label2)
                .append("\n");
        stackLabel.push(label2);

        codigo.append(label1)
                .append(":")
                .append("\n");
    }

    private void acaoSemantica112() {
        String label = getLabelName();

        codigo.append("brfalse")
                .append(" ")
                .append(label)
                .append("\n");

        stackLabel.push(label);
    }

    private void acaoSemantica111() {
        final String label = stackLabel.pop();

        codigo.append(label)
                .append(":")
                .append("\n");
    }

    private void acaoSemantica113() {
        final String labelName = getLabelName();

        codigo.append(labelName)
                .append(":")
                .append("\n");

        stackLabel.push(labelName);
    }

    private void acaoSemantica114() {
        String label = stackLabel.pop();

        codigo.append("brtrue")
                .append(" ")
                .append(label)
                .append("\n");
    }

    private void acaoSemantica115() {
        String label = stackLabel.pop();

        codigo.append("brfalse")
                .append(" ")
                .append(label)
                .append("\n");
    }

    private void acaoSemantica107() {
        codigo.append("\n");
    }

    private void acaoSemantica100() {
        codigo = new StringBuilder("""
                .assembly extern mscorlib {}
                .assembly _codigo_objeto{}
                .module _codigo_objeto.exe
                
                .class public _UNICA{
                                   
                .method static public void _principal(){
                .entrypoint\s
                                   
                """);
    }

    private void acaoSemantica101() {
        codigo.append("""
                ret
                }
                }""");
    }


    private void acaoSemantica128(Token token) {
        stackTipo.push(INT_TYPE);
        codigo.append("ldc.i8")
                .append(" ")
                .append(token.getLexeme())
                .append("\n")
                .append("conv.r8")
                .append("\n");

    }

    private void acaoSemantica129(Token token) {
        stackTipo.push(FLOAT_TYPE);
        codigo.append("ldc.r8")
                .append(" ")
                .append(token.getLexeme().replace(",", "."))
                .append("\n");
    }

    private void acaoSemantica130(Token token) {
        stackTipo.push(STRING_TYPE);
        codigo.append("ldstr")
                .append(" ")
                .append(token.getLexeme())
                .append("\n");
    }

    private void acaoSemantica116() {
        this.stackTipo.pop();
        this.stackTipo.pop();

        stackTipo.push(BOOLEAN_TYPE);

        codigo.append("and")
                .append("\n");
    }

    private void acaoSemantica117() {
        this.stackTipo.pop();
        this.stackTipo.pop();

        stackTipo.push(BOOLEAN_TYPE);

        codigo.append("or")
                .append("\n");
    }

    private void acaoSemantica118() {
        stackTipo.push(BOOLEAN_TYPE);
        codigo.append("ldc.i4.1")
                .append("\n");
    }

    private void acaoSemantica119() {
        stackTipo.push(BOOLEAN_TYPE);
        codigo.append("ldc.i4.0")
                .append("\n");
    }


    private void acaoSemantica131() {
        codigo.append("neg")
                .append("\n");
    }

    private void acaoSemantica121(Token token) {
        operador = token.getLexeme();
    }

    private void acaoSemantica122(Token token) {
        switch (this.operador) {
            case "==":
                codigo.append("ceq");
                break;
            case "!=":
                codigo.append("ceq")
                        .append("\n")
                        .append("ldc.i4.1")
                        .append("\n")
                        .append("xor");
                break;
            case ">":
                codigo.append("cgt");
                break;
            case "<":
                codigo.append("clt");
                break;
            default:
        }
        codigo.append("\n");
        stackTipo.push(BOOLEAN_TYPE);
    }


    private void acaoSemantica123() {
        String firstOperandType = this.stackTipo.pop();
        String secondOperandType = this.stackTipo.pop();

        if (firstOperandType.equals(FLOAT_TYPE) || secondOperandType.equals(FLOAT_TYPE)) {
            stackTipo.push(FLOAT_TYPE);
        } else stackTipo.push(INT_TYPE);

        codigo.append("add")
                .append("\n");
    }

    private void acaoSemantica124() {
        String firstOperandType = this.stackTipo.pop();
        String secondOperandType = this.stackTipo.pop();

        if (firstOperandType.equals(FLOAT_TYPE) || secondOperandType.equals(FLOAT_TYPE)) {
            stackTipo.push(FLOAT_TYPE);
        } else {
            stackTipo.push(INT_TYPE);
        }

        codigo.append("sub")
                .append("\n");
    }

    private void acaoSemantica125() {
        String firstOperandType = this.stackTipo.pop();
        String secondOperandType = this.stackTipo.pop();

        if (firstOperandType.equals(FLOAT_TYPE) || secondOperandType.equals(FLOAT_TYPE)) {
            stackTipo.push(FLOAT_TYPE);
        } else stackTipo.push(INT_TYPE);

        codigo.append("mul")
                .append("\n");
    }

    private void acaoSemantica126() {
        this.stackTipo.pop();
        this.stackTipo.pop();

        stackTipo.push(FLOAT_TYPE);
        codigo.append("div")
                .append("\n");
    }

    private void acaoSemantica120() {
        codigo.append("ldc.i4.1")
                .append("\n")
                .append("xor")
                .append("\n");
    }

    private void acaoSemantica127(Token token) throws SemanticError {
        final String id = token.getLexeme();

        simbolos.stream()
                .filter(v -> v.equals(id))
                .findFirst()
                .orElseThrow(() -> new SemanticError(id + " não declarado", token.getPosition()));

        codigo.append("ldloc ")
                .append(id)
                .append("\n");

        if (id.startsWith("i_")) {
            stackTipo.push(INT_TYPE);
            codigo.append("conv.r8")
                    .append("\n");
        } else if (id.startsWith("f_")) {
            stackTipo.push(FLOAT_TYPE);
        } else if (id.startsWith("s_")) {
            stackTipo.push(STRING_TYPE);
        } else {
            stackTipo.push(BOOLEAN_TYPE);
        }

    }

    private String getLabelName() {
        contadorLabel++;
        return "L" + contadorLabel;
    }

    public String getCodigo() {
        return codigo.toString();
    }
    
    public StringBuilder getCodigoStringBuilder() {
        return codigo;
    }
}