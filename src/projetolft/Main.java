/* Universidade Federal de Sergipe
 Linguagens Formais e Tradutores
 Projeto Compilador - Parte Léxica 
 Alunos: André Teixeira e Edton Lemos
 */
package projetolft;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import projetolft.lexer.*;
import projetolft.node.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
       /*O .TXT DE TESTE DEVE SER PASSADO VIA PROMPT DE COMANDO, 
         OU ADICIONADO COMO ARGUMENTO DE EXECUÇÃO NO NETBEANS*/
        
        
        Reader leitor;

        int linha = 0, coluna = 0;
        for (String arg : args) {
            try {
                leitor = new FileReader(arg);
                MyLexer lex = new MyLexer(new PushbackReader(leitor));

                while (true) {
                    Token tok = lex.next();
                    String name = tok.getClass().getSimpleName();

                    if (name.equals("EOF")) {
                        break;
                    } else {
                        name = name.substring(1, name.length()); //retirar T
                        name = name + "'" + tok.getText() + "'\n ";
                        linha = tok.getLine();
                        coluna = tok.getPos();
                    }

                    if (tok instanceof TBlanks) { //ignorar brancos
                        System.out.print(tok.getText());
                    } else {
                        System.out.print(name);
                    }
                }

            } catch (LexerException e) { //erros comuns
                System.out.println("Erro léxico na Linha: " + linha + " Coluna: " + coluna + ", O compilador não pode continuar");
            } catch (IOException f) { //erros fins
                System.out.println("Erro léxico na Linha: " + (linha + 1) + ", O compilador não pode continuar");
            }
            System.out.println("\n");
        }

        System.out.println("Compilado com Sucesso");

    }

}
