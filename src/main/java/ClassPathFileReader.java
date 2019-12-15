import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Code snippet shows how to read file from context
 */

public class ClassPathFileReader {
    public static void readFileFromClassPath() {
        String resourceName = "data.properties"; // could also be a constant
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
