import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessageSender {
    public static void main(String[] args) {
        String message = "Ping";

        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] data = message.getBytes();

            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(
                    data, data.length, address, 6000);

            socket.send(packet);
            System.out.println("Message sent: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
