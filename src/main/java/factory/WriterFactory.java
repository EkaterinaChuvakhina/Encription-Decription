package factory;

import configuration.Configuration;
import writer.ConsoleOutput;
import writer.FileWriter;
import writer.Writer;

public class WriterFactory {
    public static Writer create(Configuration configuration) {
        if (configuration.getPathOutputFile() != null) {
            return new FileWriter(configuration.getPathOutputFile());
        } else {
            return new ConsoleOutput();
        }
    }
}
