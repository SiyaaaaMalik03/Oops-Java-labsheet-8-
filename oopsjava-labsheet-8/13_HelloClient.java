import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("HelloServer is waiting on port 5000...");

            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
