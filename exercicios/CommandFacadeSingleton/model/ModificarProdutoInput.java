public class ModificarProdutoInput extends Produto {
    private int newId;

    public ModificarProdutoInput(int newId, int id, String nome, int quantidade) {
        super(id, nome, quantidade);
        this.newId = newId;
    }
}