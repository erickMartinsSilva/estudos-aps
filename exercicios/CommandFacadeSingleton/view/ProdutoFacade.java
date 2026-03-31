package CommandFacadeSingleton.view;

import CommandFacadeSingleton.control.*;
import CommandFacadeSingleton.control.commands.*;
import CommandFacadeSingleton.model.*;

public class ProdutoFacade {
    private ProdutoInvoker invoker = ProdutoInvoker.getInstance();

    public void runCommand(String[] args) {
        String command = args[0];

        int id, newId, quantidade;
        String nome;

        switch(command) {
            case "Incluir":
                id = Integer.parseInt(args[1]);
                nome = args[2];
                quantidade = Integer.parseInt(args[3]);
                incluirProduto(id, nome, quantidade);
                break;
            case "Alterar":
                id = Integer.parseInt(args[1]);
                newId = Integer.parseInt(args[2]);
                nome = args[3];
                quantidade = Integer.parseInt(args[4]);
                alterarProduto(id, newId, nome, quantidade);
                break;
            case "Excluir":
                id = Integer.parseInt(args[1]);
                excluirProduto(id);
                break;
            case "Listar":
                listarProdutos();
                break;
            default:
                throw new IllegalArgumentException("ERRO: Comando inválido: " + command);
        }
    }

    private void incluirProduto(int id, String nome, int quantidade) {
        Produto p = new Produto(id, nome, quantidade);
        ProdutoCommand command = new IncluirProdutoCommand();
        invoker.executeCommand(command, p);
    }

    private void alterarProduto(int id, int newId, String nome, int quantidade) {
        ModificarProdutoInput p = new ModificarProdutoInput(id, newId, nome, quantidade);
        ProdutoCommand command = new AlterarProdutoCommand();
        invoker.executeCommand(command, p);
    }

    private void excluirProduto(int id) {
        Produto p = new Produto(id, "", 0);
        ProdutoCommand command = new ExcluirProdutoCommand();
        invoker.executeCommand(command, p);
    }

    private void listarProdutos() {
        ProdutoCommand command = new ListarProdutosCommand();
        invoker.executeCommand(command, null);
    }
}
