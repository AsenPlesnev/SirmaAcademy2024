import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
