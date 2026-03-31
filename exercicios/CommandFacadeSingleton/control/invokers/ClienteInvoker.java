package control;

import CommandFacadeSingleton.model.Cliente;
import CommandFacadeSingleton.model.ModificarClienteInput;

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

    public void executeCommand(ClienteCommand command, Cliente c) {
        command.execute(c);
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
