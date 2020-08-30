import algorithm.Algorithm;
import context.CipherContext;
import executor.Executor;
import parser.ConsoleParser;
import configuration.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = ConsoleParser.parse(args);
        CipherContext cipherContext = new CipherContext(configuration);

        String inputData = cipherContext.getReader().read();
        Algorithm algorithm = cipherContext.getAlgorithm();
        Executor executor = new Executor(algorithm);
        String cipherData = executor.execute(configuration.getEncodingMode(),inputData);
        cipherContext.getWriter().write(cipherData);
    }
}
