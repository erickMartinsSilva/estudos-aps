package FactoryMethod;

public class ArqueiroCreator implements Creator {
    public Unidade criarUnidade() {
        return new Arqueiro();
    }
}