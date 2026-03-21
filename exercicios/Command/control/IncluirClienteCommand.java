package Command.control;

import Command.model.Cliente;

public class IncluirClienteCommand extends ClienteCommand {
    public void execute(Cliente c) {
        this.instance.addCliente(c);
    }

    public void undo() {
        this.instance.deleteLastCliente();
    }
}
