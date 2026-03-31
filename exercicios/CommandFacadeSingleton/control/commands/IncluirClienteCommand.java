package control;

import CommandFacadeSingleton.model.Cliente;

public class IncluirClienteCommand extends ClienteCommand {
    public void execute(Cliente c) {
        this.instance.addCliente(c);
    }

    public void undo() {
        this.instance.deleteLastCliente();
    }
}
