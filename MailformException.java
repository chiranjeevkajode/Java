import java.net.MalformedURLException;
import java.net.URL;

public class MailformException {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com");
            System.out.println("URL PROTOCOL: " + url.getProtocol());
        } catch (MalformedURLException e) {
            System.out.println("correct the Protocol : " + e);
        }
    }
}
