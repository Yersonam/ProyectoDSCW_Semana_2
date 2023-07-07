// Concrete State classes
class ConcreteStateA implements State {
    public void doAction(Context context) {
        System.out.println("State A: Performing action and transitioning to State B.");
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB implements State {
    public void doAction(Context context) {
        System.out.println("State B: Performing action and transitioning back to State A.");
        context.setState(new ConcreteStateA());
    }
}
