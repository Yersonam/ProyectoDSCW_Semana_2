// Concrete Visitor
class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Visitor visits ConcreteElementA.");
        element.operationA();
    }

    public void visit(ConcreteElementB element) {
        System.out.println("Visitor visits ConcreteElementB.");
        element.operationB();
    }
}
