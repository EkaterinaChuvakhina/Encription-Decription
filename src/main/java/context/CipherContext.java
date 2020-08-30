package context;

import algorithm.Algorithm;
import factory.AlgorithmFactory;
import factory.ReaderFactory;
import factory.WriterFactory;
import configuration.Configuration;
import reader.Reader;
import writer.Writer;

public class CipherContext {
    private final Reader reader;
    private final Algorithm algorithm;
    private final Writer writer;

    public CipherContext(Configuration configuration) {
        this.reader = ReaderFactory.create(configuration);
        this.algorithm = AlgorithmFactory.create(configuration.getAlgorithmType(), configuration.getKey());
        this.writer = WriterFactory.create(configuration);
    }

    public Reader getReader() {
        return reader;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public Writer getWriter() {
        return writer;
    }
}
