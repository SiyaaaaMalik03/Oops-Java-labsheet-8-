import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Echo Server waiting on port 5000...");

            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String message = in.readLine();
                System.out.println("Received: " + message);
                out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
