package CommandFacadeSingleton.model;

import CommandFacadeSingleton.errors.ClienteNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private static ClienteRepository instance;
    private static List<Cliente> clienteList = new ArrayList<Cliente>();

    public ClienteRepository() {}

    public static ClienteRepository getInstance() {
        if(instance == null) {
            instance = new ClienteRepository();
        }
        return instance;
    }

    public int find(Cliente c) throws ClienteNotFoundException {
        int index = clienteList.indexOf(c);
        if(index == -1) {
            throw new ClienteNotFoundException(c.getId());
        }
        return index;
    }

    public void addCliente(Cliente c) {
        clienteList.add(c);
    }

    public void modifyCliente(Cliente c) {
        try {
            if(c instanceof ModificarClienteInput) {
                ModificarClienteInput input = (ModificarClienteInput) c;
                Cliente oldRef = this.getCliente(input.getId());
                if(oldRef == null) {
                    return;
                }
                int index = this.find(oldRef);
                Cliente cliente = clienteList.get(index);
                cliente.setId(input.id_novo);
                cliente.setNome(input.getNome());
            } else {
                int index = this.find(c);
                Cliente cliente = clienteList.get(index);
                cliente.setId(c.getId());
                cliente.setNome(c.getNome());
            }
        } catch (ClienteNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteCliente(Cliente c) {
        try {
            int index = this.find(c);
            clienteList.remove(index);
        } catch (ClienteNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteLastCliente() {
        if(clienteList.isEmpty()) {
            System.out.println("Lista de clientes vazia!");
        } else {
            clienteList.remove(clienteList.size()-1);
        }
    }

    public Cliente getCliente(int id) {
        try {
            Cliente aux = new Cliente(id, "");
            int index = this.find(aux);
            return clienteList.get(index);
        } catch (ClienteNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public String getClientes() {
        if(clienteList.isEmpty()) {
            System.out.println("Lista de clientes vazia!");
        }
        return clienteList.toString();
    }
}
