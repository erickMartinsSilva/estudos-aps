package control;

import CommandFacadeSingleton.model.Cliente;

public class ListarClientesCommand extends ClienteCommand {
    public void execute(Cliente c) {
        String clientes = this.instance.getClientes();
        System.out.println(clientes);
    }

    public void undo() {}
}
