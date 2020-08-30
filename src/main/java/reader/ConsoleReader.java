package reader;

public class ConsoleReader implements Reader {
    private final String data;

    public ConsoleReader(String data) {
        this.data = data;
    }

    public String read() {
        return data;
    }
}
