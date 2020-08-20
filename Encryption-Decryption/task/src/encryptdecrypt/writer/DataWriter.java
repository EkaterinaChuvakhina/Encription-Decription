package encryptdecrypt.writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DataWriter {
    public static void write(String path, String data) {
        try (PrintWriter writer = new PrintWriter(new File(path))) {
            writer.print(data);
        } catch (IOException e) {
            System.out.println("Error writing in file");
        }
    }
}
