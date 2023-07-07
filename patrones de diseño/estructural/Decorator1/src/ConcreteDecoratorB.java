// Concrete Decorator B
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        additionalOperation();
    }

    private void additionalOperation() {
        System.out.println("ConcreteDecoratorB: additionalOperation()");
    }
}
