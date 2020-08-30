package writer;

public class ConsoleOutput implements Writer {
    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
