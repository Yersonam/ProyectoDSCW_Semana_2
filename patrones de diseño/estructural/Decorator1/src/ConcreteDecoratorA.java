// Concrete Decorator A
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        additionalOperation();
    }

    private void additionalOperation() {
        System.out.println("ConcreteDecoratorA: additionalOperation()");
    }
}