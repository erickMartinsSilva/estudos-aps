package FactoryMethod;

public class CavalariaCreator implements Creator {
    @Override
    public Unidade criarUnidade() {
        return new Cavalaria();
    }
}