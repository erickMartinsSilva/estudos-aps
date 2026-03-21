package Command.control;

import Command.model.Cliente;
import Command.model.ModificarClienteInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ClienteInvoker {
    public static ClienteInvoker instance;
    public static Map<String, ClienteCommand> comandos = new HashMap<String, ClienteCommand>();
    private Stack<ClienteCommand> historico = new Stack<>();

    static {
        comandos.put("Incluir Cliente", new IncluirClienteCommand());
        comandos.put("Modificar Cliente", new ModificarClienteCommand());
        comandos.put("Excluir Cliente", new DeletarClienteCommand());
        comandos.put("Listar Clientes", new ListarClientesCommand());
    }

    public ClienteInvoker() {}

    public static ClienteInvoker getInstance() {
        if(instance == null) {
            instance = new ClienteInvoker();
        }
        return instance;
    }

    public void runCommand(String command, int id, int newId, String nome) {
        try {
            ClienteCommand c = comandos.get(command);
            Cliente cliente;

            // Modificar Cliente requires both the current id and the new id
            if(c instanceof ModificarClienteCommand) {
                cliente = new ModificarClienteInput(id, newId, nome);
            } else {
                cliente = new Cliente(id, nome);
            }

            c.execute(cliente);
            historico.add(c);
        } catch (NullPointerException e) {
            System.err.println("ERRO: Comando incorreto (" + command + ")");
        }
    }

    public void undoCommand() {
        if(!historico.isEmpty()) {
            ClienteCommand c = historico.pop();
            c.undo();
        }
    }

    public void undoAllCommands() {
        while(!historico.isEmpty()) {
            this.undoCommand();
        }
    }
}
