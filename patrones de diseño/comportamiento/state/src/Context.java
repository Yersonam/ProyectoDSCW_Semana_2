// Context class
class Context {
    private State state;

    public Context() {
        state = new ConcreteStateA(); // Set initial state to State A
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
