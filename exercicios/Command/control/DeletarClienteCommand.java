package Command.control;

import Command.model.Cliente;

public class DeletarClienteCommand extends ClienteCommand {
    public Cliente backup;

    public void execute(Cliente c) {
        backup = this.instance.getCliente(c.getId());
        this.instance.deleteCliente(c);
    }

    public void undo() {
        this.instance.addCliente(backup);
    }
}
