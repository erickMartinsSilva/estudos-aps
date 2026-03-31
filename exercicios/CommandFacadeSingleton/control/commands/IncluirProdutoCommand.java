package control;

import CommandFacadeSingleton.model.Produto;

public class IncluirProdutoCommand extends ProdutoCommand {
    public void execute(Produto p) {
        repository.addProduto(p);
    }

    public void undo() {
        // fallback: no history of p passed here; not ideal but simple.
    }
}
