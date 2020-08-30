package reader;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader implements Reader {
    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    @Override
    public String read() {
        StringBuilder in = new StringBuilder();

        try (Scanner sc = new Scanner(Paths.get(path))) {
            while (sc.hasNextLine()) {
                in.append(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
        return in.toString();

    }
}
