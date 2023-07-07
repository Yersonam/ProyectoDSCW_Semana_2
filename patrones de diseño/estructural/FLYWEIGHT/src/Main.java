// Client
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("Key 1");
        flyweight1.operation();
        // Output:
        // ConcreteFlyweight: Key 1

        Flyweight flyweight2 = flyweightFactory.getFlyweight("Key 2");
        flyweight2.operation();
        // Output:
        // ConcreteFlyweight: Key 2

        Flyweight flyweight3 = flyweightFactory.getFlyweight("Key 1");
        flyweight3.operation();
        // Output:
        // ConcreteFlyweight: Key 1 (reused)

        System.out.println("flyweight1 == flyweight3? " + (flyweight1 == flyweight3));
        // Output:
        // flyweight1 == flyweight3? true
    }
}