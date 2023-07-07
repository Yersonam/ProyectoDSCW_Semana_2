// Concrete Handler C
class ConcreteHandlerC implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("TypeC")) {
            System.out.println("ConcreteHandlerC: Handling request: " + request.getContent());
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("ConcreteHandlerC: Cannot handle the request.");
        }
    }
}