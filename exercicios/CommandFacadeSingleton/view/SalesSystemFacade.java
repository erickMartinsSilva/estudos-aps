package CommandFacadeSingleton.view;

public class SalesSystemFacade {
    private ClienteFacade fClienteFacade = new ClienteFacade();
    private ProdutoFacade fProdutoFacade = new ProdutoFacade();

    public void runCommand(String input) {
        String[] args = input.split(" ");

        if(args.length < 2) {
            throw new IllegalArgumentException("ERRO: comando invalido");
        }

        String entity = args[1];

        switch(entity.toLowerCase()) {
            case "cliente":
                fClienteFacade.runCommand(args);
                break;
            case "produto":
                fProdutoFacade.runCommand(args);
                break;
            default:
                throw new IllegalArgumentException("ERRO: Entidade não encontrada: " + entity);
        }
    }
}
