package CommandFacadeSingleton.control.invokers;

import java.util.Stack;
import CommandFacadeSingleton.control.ProdutoCommand;
import CommandFacadeSingleton.model.Produto;

public class ProdutoInvoker {
    public static ProdutoInvoker instance;
    private Stack<ProdutoCommand> historico = new Stack<>();

    public static ProdutoInvoker getInstance() {
        if(instance == null) {
            instance = new ProdutoInvoker();
        }
        return instance;
    }

    public void executeCommand(ProdutoCommand command, Produto p) {
        command.execute(p);
        historico.push(command);
    }

    public void undoLastCommand() {
        if(!historico.isEmpty()) {
            ProdutoCommand command = historico.pop();
            command.undo();
        }
    }

    public void undoAllCommands() {
        while(!historico.isEmpty()) {
            this.undoLastCommand();
        }
    }
}
