package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = """
                3 + 5 * (10 - 4)
                """;
        Lexer lexer = new Lexer(input);
        List<Lexer.Token> tokens = new ArrayList<>();
        for(Lexer.Token token: lexer){
            tokens.add(token);
        }
        Parser parser = new Parser(tokens);
        ASTNode root = parser.parse();
        root.print("  ");
    }
    //
}