package errors;

public class ClienteNotFoundException extends Exception {
    public ClienteNotFoundException(int id) {
        super("Cliente não encontrado para o ID " + id);
    }
}
