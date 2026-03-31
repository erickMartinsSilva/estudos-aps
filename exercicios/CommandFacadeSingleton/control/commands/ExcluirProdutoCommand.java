package control;

import CommandFacadeSingleton.model.Produto;

public class ExcluirProdutoCommand extends ProdutoCommand {
    private Produto backup;

    public void execute(Produto p) {
        backup = repository.getProdutoById(p.getId());
        try {
            repository.deleteProduto(p.getId());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void undo() {
        if (backup != null) {
            repository.addProduto(backup);
        }
    }
}
