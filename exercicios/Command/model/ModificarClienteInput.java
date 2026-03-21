package Command.model;

public class ModificarClienteInput extends Cliente {
    public int id_novo;

    public ModificarClienteInput(int id, int id_novo, String nome) {
        super(id, nome);
        this.id_novo = id_novo;
    }
}
