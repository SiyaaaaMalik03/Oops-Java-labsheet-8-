import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServerReadMessage {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server waiting on port 5000...");

            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()))) {

                String message = in.readLine();
                System.out.println("Client connected");
                System.out.println("Received from client: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
