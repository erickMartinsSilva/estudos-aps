package errors;

public class ProdutoNotFoundException extends Exception {
    public ProdutoNotFoundException(int id) {
        super("Produto não encontrado para o ID " + id);
    }
}
