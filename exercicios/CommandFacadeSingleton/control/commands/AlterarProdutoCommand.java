package control;

import CommandFacadeSingleton.model.Produto;
import CommandFacadeSingleton.model.ModificarProdutoInput;

public class AlterarProdutoCommand extends ProdutoCommand {
    private Produto backup;

    public void execute(Produto p) {
        if (!(p instanceof ModificarProdutoInput)) {
            System.err.println("ERRO: Entrada inválida para Alterar Produto");
            return;
        }

        ModificarProdutoInput input = (ModificarProdutoInput) p;
        backup = repository.getProdutoById(input.getId());
        if (backup != null) {
            try {
                repository.updateProduto(input.getId(), input);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void undo() {
        if (backup != null) {
            try {
                repository.updateProduto(backup.getId(), backup);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
