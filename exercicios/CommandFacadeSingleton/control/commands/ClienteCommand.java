package control;

import CommandFacadeSingleton.model.Cliente;
import CommandFacadeSingleton.model.ClienteRepository;

public abstract class ClienteCommand {
    public ClienteRepository instance = ClienteRepository.getInstance();

    public abstract void execute(Cliente c);
    public abstract void undo();
}
