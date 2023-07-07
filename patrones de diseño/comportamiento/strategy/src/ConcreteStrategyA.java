// Concrete Strategy classes
class ConcreteStrategyA implements Strategy {
    public void executeStrategy() {
        System.out.println("Executing strategy A.");
    }
}

class ConcreteStrategyB implements Strategy {
    public void executeStrategy() {
        System.out.println("Executing strategy B.");
    }
}
