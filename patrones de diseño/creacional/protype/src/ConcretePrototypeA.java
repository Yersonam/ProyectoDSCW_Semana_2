// Concrete Prototype A
class ConcretePrototypeA implements Prototype {
    private String attribute;

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Prototype clone() {
        ConcretePrototypeA clone = new ConcretePrototypeA();
        clone.setAttribute(this.attribute);
        return clone;
    }

    public void printAttribute() {
        System.out.println("Attribute of ConcretePrototypeA: " + attribute);
    }
}