import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader {
    public static void main(String[] args) {
        String fileUrl = "https://www.example.com/sample.txt";
        String outputFile = "sample.txt";

        try {
            URL url = new URL(fileUrl);
            URLConnection connection = url.openConnection();

            try (InputStream in = connection.getInputStream();
                 OutputStream out = new FileOutputStream(outputFile)) {

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("File downloaded successfully: " + outputFile);
        } catch (Exception e) {
            System.out.println("Download failed: " + e.getMessage());
        }
    }
}
