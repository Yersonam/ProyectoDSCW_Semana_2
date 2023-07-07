// Refined Abstraction B
class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        System.out.println("Operation in RefinedAbstractionB");
        implementor.operationImpl();
    }
}