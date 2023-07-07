// Concrete Prototype B
class ConcretePrototypeB implements Prototype {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public Prototype clone() {
        ConcretePrototypeB clone = new ConcretePrototypeB();
        clone.setNumber(this.number);
        return clone;
    }

    public void printNumber() {
        System.out.println("Number of ConcretePrototypeB: " + number);
    }
}