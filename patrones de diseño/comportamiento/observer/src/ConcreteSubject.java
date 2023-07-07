// Concrete Subject
import java.util.ArrayList;
import java.util.List;
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void doSomething() {
        // Perform some action
        // ...

        // Notify observers
        notifyObservers("Something happened");
    }
}