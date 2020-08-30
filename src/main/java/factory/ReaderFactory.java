package factory;

import configuration.Configuration;
import reader.ConsoleReader;
import reader.FileReader;
import reader.Reader;

public class ReaderFactory {
    public static Reader create(Configuration configuration) {
        if (configuration.getData() != null) {
            return new ConsoleReader(configuration.getData());
        } else {
            return new FileReader(configuration.getPathInputFile());
        }
    }
}
