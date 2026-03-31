package view;

import CommandFacadeSingleton.control.ClienteInvoker;

import java.util.*;

public class Client {
    public static void prompt() {
        System.out.print("vivendas> ");
    }

    public static void printHelp() {
        System.out.print("Comandos Disponíveis:\n" +
                "Incluir Cliente [id] [nome]\n" +
                "Alterar Cliente [id] [novo_id] [nome]\n" +
                "Excluir Cliente [id]\n" +
                "Listar Clientes\n" +
                "\n" +
                "Incluir Produto [id] [nome] [quantidade]\n" +
                "Alterar Produto [id] [novo_id] [nome] [quantidade]\n" +
                "Excluir Produto [id]\n" +
                "Listar Produtos\n"
        );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SalesSystemFacade facade = new SalesSystemFacade();

        do {
            try {
                prompt();
                String input = scan.nextLine();

                if(input.equals("help")) {
                    printHelp();
                } else {
                    facade.runCommand(input);
                }
            } catch(Exception e) {
                System.err.println(e);
            }
        } while(true);
    }
}
