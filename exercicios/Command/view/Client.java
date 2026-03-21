package Command.view;

import Command.control.ClienteInvoker;

import java.util.*;

public class Client {
    public static void prompt() {
        System.out.print("clientemanip> ");
    }

    public static void printHelp() {
        System.out.print("""
                Comandos Disponíveis:
                Incluir Cliente [id] [nome]
                Alterar Cliente[id] [nome]
                Excluir Cliente [id]
                Listar Clientes
                """
        );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClienteInvoker invoker = ClienteInvoker.getInstance();
        String command = "";

        try {
            do {
                prompt();
                if(!scan.hasNextLine()) {
                    return;
                }

                String input = scan.nextLine().trim();
                if(input.isEmpty()) {
                    continue;
                }

                String[] dividedInput = input.split(" ");
                if(dividedInput.length < 2) {
                    System.err.println("ERRO: Comando inválido");
                    continue;
                }

                command = dividedInput[0] + " " + dividedInput[1];

                if(command.equals("exit")) {
                    return;
                } else if(command.equals("help")) {
                    printHelp();
                    continue;
                }

                int id = -1;
                int newId = -1;
                String nome = "";

                try {
                    switch (command) {
                        case "Incluir Cliente" -> {
                            if(dividedInput.length < 3) {
                                System.err.println("ERRO: Informe [id] [nome]");
                                continue;
                            }
                            id = Integer.parseInt(dividedInput[2]);
                            if(dividedInput.length > 3) {
                                nome = String.join(" ", Arrays.copyOfRange(dividedInput, 3, dividedInput.length));
                            }
                        }
                        case "Excluir Cliente" -> {
                            if(dividedInput.length < 3) {
                                System.err.println("ERRO: Informe [id]");
                                continue;
                            }
                            id = Integer.parseInt(dividedInput[2]);
                        }
                        case "Listar Clientes" -> {
                            // no args
                        }
                        case "Modificar Cliente" -> {
                            if(dividedInput.length < 5) {
                                System.err.println("ERRO: Informe [id] [new_id] [new_name]");
                                continue;
                            }
                            id = Integer.parseInt(dividedInput[2]);       // current id
                            newId = Integer.parseInt(dividedInput[3]);    // desired id
                            nome = String.join(" ", Arrays.copyOfRange(dividedInput, 4, dividedInput.length));
                        }
                        default -> {
                            System.err.println("ERRO: Comando incorreto (" + command + ")");
                            continue;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("ERRO: IDs devem ser numéricos");
                    continue;
                }

                invoker.runCommand(command, id, newId, nome);
            } while (true);
        } catch (NoSuchElementException e) {
            return;
        }

    }
}
