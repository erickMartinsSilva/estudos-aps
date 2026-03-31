package control;

import CommandFacadeSingleton.model.Cliente;
import CommandFacadeSingleton.model.ModificarClienteInput;

public class ModificarClienteCommand extends ClienteCommand {
    public Cliente backup;
    private int updatedId = -1;

    public void execute(Cliente c) {
        if(!(c instanceof ModificarClienteInput)) {
            System.err.println("ERRO: Entrada inválida para Modificar Cliente");
            return;
        }

        ModificarClienteInput input = (ModificarClienteInput) c;
        Cliente current = this.instance.getCliente(input.getId());

        // store a copy to allow proper undo even after mutation
        if(current != null) {
            backup = new Cliente(current.getId(), current.getNome());
            this.instance.modifyCliente(input);
            this.updatedId = input.id_novo;
        }
    }

    public void undo() {
        if(backup != null && updatedId != -1) {
            // find the record using the last updated id and revert to the backup values
            this.instance.modifyCliente(new ModificarClienteInput(updatedId, backup.getId(), backup.getNome()));
        }
    }
}
