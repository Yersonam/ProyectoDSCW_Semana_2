// Refined Abstraction A
class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        System.out.println("Operation in RefinedAbstractionA");
        implementor.operationImpl();
    }
}