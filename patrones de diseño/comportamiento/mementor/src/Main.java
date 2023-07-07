// Client
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        System.out.println("Current state: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.retrieveMemento());
        System.out.println("Restored state: " + originator.getState());
    }
}