import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WebReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
