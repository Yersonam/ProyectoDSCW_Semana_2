// Client
public class Main {
    public static void main(String[] args) {
        // Create the chain of responsibility
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        // Create requests
        Request request1 = new Request("TypeA", "Request A");
        Request request2 = new Request("TypeB", "Request B");
        Request request3 = new Request("TypeC", "Request C");
        Request request4 = new Request("TypeD", "Request D");

        // Process the requests
        handlerA.handleRequest(request1);
        handlerA.handleRequest(request2);
        handlerA.handleRequest(request3);
        handlerA.handleRequest(request4);

        // Output:
        // ConcreteHandlerA: Handling request: Request A
        // ConcreteHandlerB: Handling request: Request B
        // ConcreteHandlerC: Handling request: Request C
        // ConcreteHandlerA: Cannot handle the request.
    }
}