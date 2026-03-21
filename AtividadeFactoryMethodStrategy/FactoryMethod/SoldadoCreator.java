package FactoryMethod;

public class SoldadoCreator implements Creator {
    @Override
    public Unidade criarUnidade() {
        return new Soldado();
    }
}