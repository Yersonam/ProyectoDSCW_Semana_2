// Concrete Handler B
class ConcreteHandlerB implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("TypeB")) {
            System.out.println("ConcreteHandlerB: Handling request: " + request.getContent());
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("ConcreteHandlerB: Cannot handle the request.");
        }
    }
}