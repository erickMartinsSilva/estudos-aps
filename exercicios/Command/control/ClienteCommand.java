package Command.control;

import Command.model.Cliente;
import Command.model.ClienteRepository;

public abstract class ClienteCommand {
    public ClienteRepository instance = ClienteRepository.getInstance();

    public abstract void execute(Cliente c);
    public abstract void undo();
}
