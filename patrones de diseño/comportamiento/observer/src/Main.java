// Client
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.doSomething();
        // Output:
        // Observer 1 received message: Something happened
        // Observer 2 received message: Something happened

        subject.unregisterObserver(observer2);

        subject.doSomething();
        // Output:
        // Observer 1 received message: Something happened
    }
}