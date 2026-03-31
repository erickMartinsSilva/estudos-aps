package CommandFacadeSingleton.view;

import CommandFacadeSingleton.control.invokers.ClienteInvoker;
import CommandFacadeSingleton.control.ClienteCommand;
import CommandFacadeSingleton.control.IncluirClienteCommand;
import CommandFacadeSingleton.control.ModificarClienteCommand;
import CommandFacadeSingleton.control.DeletarClienteCommand;
import CommandFacadeSingleton.control.ListarClientesCommand;
import CommandFacadeSingleton.model.Cliente;
import CommandFacadeSingleton.model.ModificarClienteInput;

public class ClienteFacade {
    private ClienteInvoker invoker = ClienteInvoker.getInstance();

    public void runCommand(String[] args) {
        String command = args[0] + " " + args[1];
        int id, newId;
        String nome;

        switch(command) {
            case "Incluir Cliente":
                id = Integer.parseInt(args[2]);
                nome = args[3];
                incluirCliente(id, nome);
                break;
            case "Alterar Cliente":
                id = Integer.parseInt(args[2]);
                newId = Integer.parseInt(args[3]);
                nome = args[4];
                alterarCliente(id, newId, nome);
                break;
            case "Excluir Cliente":
                id = Integer.parseInt(args[2]);
                excluirCliente(id);
                break;
            case "Listar Clientes":
                listarClientes();
                break;
            default:
                throw new IllegalArgumentException("ERRO: Comando inválido: " + String.join(" ", args));
        }
    }

    private void incluirCliente(int id, String nome) {
        Cliente c = new Cliente(id, nome);
        ClienteCommand command = new IncluirClienteCommand();
        invoker.executeCommand(command, c);
    }

    private void alterarCliente(int id, int newId, String nome) {
        Cliente c = new ModificarClienteInput(id, newId, nome);
        ClienteCommand command = new ModificarClienteCommand();
        invoker.executeCommand(command, c);
    }

    private void excluirCliente(int id) {
        Cliente c = new Cliente(id, "");
        ClienteCommand command = new DeletarClienteCommand();
        invoker.executeCommand(command, c);
    }

    private void listarClientes() {
        ClienteCommand command = new ListarClientesCommand();
        invoker.executeCommand(command, null);
    }
}
