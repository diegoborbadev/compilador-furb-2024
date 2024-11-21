package AnalizadorLexico;

public interface Constants extends ScannerConstants, ParserConstants {
    int EPSILON = 0;
    int DOLLAR = 1;

    int t_palavra_reservada = 2;
    int t_main = 3;
    int t_end = 4;
    int t_if = 5;
    int t_elif = 6;
    int t_else = 7;
    int t_false = 8;
    int t_true = 9;
    int t_read = 10;
    int t_write = 11;
    int t_writeln = 12;
    int t_repeat = 13;
    int t_until = 14;
    int t_while = 15;
    int t_identificador = 16;
    int t_constante_int = 17;
    int t_constante_float = 18;
    int t_constante_String = 19;
    int t_TOKEN_20 = 20; //"&&"
    int t_TOKEN_21 = 21; //"||"
    int t_TOKEN_22 = 22; //"!"
    int t_TOKEN_23 = 23; //"=="
    int t_TOKEN_24 = 24; //"!="
    int t_TOKEN_25 = 25; //"<"
    int t_TOKEN_26 = 26; //">"
    int t_TOKEN_27 = 27; //"+"
    int t_TOKEN_28 = 28; //"-"
    int t_TOKEN_29 = 29; //"*"
    int t_TOKEN_30 = 30; //"/"
    int t_TOKEN_31 = 31; //","
    int t_TOKEN_32 = 32; //";"
    int t_TOKEN_33 = 33; //"="
    int t_TOKEN_34 = 34; //"("
    int t_TOKEN_35 = 35; //")"
}