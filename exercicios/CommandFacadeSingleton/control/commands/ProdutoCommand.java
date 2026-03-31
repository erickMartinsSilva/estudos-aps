package control;

import CommandFacadeSingleton.model.Produto;
import CommandFacadeSingleton.model.ProdutoRepository;

public abstract class ProdutoCommand {
    protected static ProdutoRepository repository = ProdutoRepository.getInstance();

    public abstract void execute(Produto p);
    public abstract void undo();
}
