// Concrete Handler A
class ConcreteHandlerA implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("TypeA")) {
            System.out.println("ConcreteHandlerA: Handling request: " + request.getContent());
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("ConcreteHandlerA: Cannot handle the request.");
        }
    }
}