package model;

import CommandFacadeSingleton.errors.ProdutoNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private static ProdutoRepository instance;
    private static List<Produto> produtoList = new ArrayList<Produto>();

    public ProdutoRepository() {}

    public static ProdutoRepository getInstance() {
        if(instance == null) {
            instance = new ProdutoRepository();
        }
        return instance;
    }

    public Produto getProdutoById(int id) {
        for (Produto p : produtoList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> getAllProdutos() {
        return produtoList;
    }

    public void addProduto(Produto p) {
        produtoList.add(p);
    }

    public void updateProduto(int id, Produto data) throws ProdutoNotFoundException {
        Produto produtoInList = getProdutoById(id);
        if(produtoInList == null) {
            throw new ProdutoNotFoundException(id);
        }
        int produtoInListIndex = produtoList.indexOf(produtoInList);
        produtoList.set(produtoInListIndex, data);
    }

    public void deleteProduto(int id) throws ProdutoNotFoundException {
        Produto produtoInList = getProdutoById(id);
        if(produtoInList == null) {
            throw new ProdutoNotFoundException(id);
        }
        int produtoInListIdx = produtoList.indexOf(produtoInList);
        produtoList.remove(produtoInListIdx);
    }
}
