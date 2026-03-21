package FactoryMethod;

import Strategy.IStrategy;

public abstract class Unidade {
    public IStrategy strategy;

    public Unidade() {
        this.alocar();
    }

    public void alocar() {};
    
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    };

    public void executeStrategy() {
        strategy.execute();
    };
    
}