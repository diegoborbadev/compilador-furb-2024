package main.java;

import java.util.ArrayList;
import java.util.List;

public class TabelaTokens {
    private static class Token {
        int linha;
        String classe;
        String lexema;

        Token(int linha, String classe, String lexema) {
            this.linha = linha;
            this.classe = classe;
            this.lexema = lexema;
        }
    }

    private final List<Token> tokens;
    private int maxLinhaLength = "Linha".length();
    private int maxClasseLength = "Classe".length();
    private int maxLexemaLength = "Lexema".length();

    public TabelaTokens() {
        tokens = new ArrayList<>();
    }

    public void adicionarToken(int linha, String classe, String lexema) {
        tokens.add(new Token(linha, classe, lexema));

        maxLinhaLength = Math.max(maxLinhaLength, String.valueOf(linha).length());
        maxClasseLength = Math.max(maxClasseLength, classe.length());
        maxLexemaLength = Math.max(maxLexemaLength, lexema.length());
    }

    public String gerarTabela() {
        StringBuilder tabela = new StringBuilder();
        String formato = "%-" + maxLinhaLength + "s %-" + maxClasseLength + "s %-" + maxLexemaLength + "s%n";
        tabela.append(String.format(formato, "Linha", "Classe", "Lexema"));
        tokens.forEach(token -> tabela.append(String.format(formato, token.linha, token.classe, token.lexema)));
        return tabela.toString();
    }

    @Override
    public String toString() {
        return gerarTabela();
    }
}