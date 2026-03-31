package CommandFacadeSingleton.control;

import CommandFacadeSingleton.model.Produto;
import java.util.List;

public class ListarProdutosCommand extends ProdutoCommand {
    public void execute(Produto p) {
        List<Produto> list = repository.getAllProdutos();
        for (Produto produto : list) {
            System.out.println(produto);
        }
    }

    public void undo() {}
}
