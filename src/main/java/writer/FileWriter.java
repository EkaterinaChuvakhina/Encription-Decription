package writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter implements Writer {
    private final String fileOutputPath;

    public FileWriter(String fileOutputPath) {
        this.fileOutputPath = fileOutputPath;
    }

    @Override
    public void write(String data) {
        try (PrintWriter writer = new PrintWriter(new File(fileOutputPath))) {
            writer.print(data);
        } catch (IOException e) {
            System.out.println("Error writing in file");
        }
    }
}
