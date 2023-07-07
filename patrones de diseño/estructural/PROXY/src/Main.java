// Client
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
        // Output:
        // Proxy: Preparing request.
        // RealSubject: Handling request.
        // Proxy: Finishing request.
    }
}