package parser;

import algorithm.AlgorithmType;
import configuration.Configuration;
import executor.CipherMode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleParser {
    public static final String DATA = "-data";
    public static final String INPUT = "-in";
    public static final String OUTPUT = "-out";
    public static final String ENC_MODE = "-mode";
    public static final String ALG = "-alg";
    public static final String KEY = "-key";

    private static String getOption(List<String> argsCommandLine, String arg) {
        if (argsCommandLine.contains(arg)) {
            return argsCommandLine.get(argsCommandLine.indexOf(arg) + 1);
        } else {
            return null;
        }
    }

    public static Configuration parse(String[] args) {
        Configuration configuration = new Configuration();
        List<String> argsCommandLine = new ArrayList<>(args.length);
        argsCommandLine.addAll(Arrays.asList(args));

        String data = getOption(argsCommandLine, DATA);
        configuration.setData(data == null ? "" : data);
        configuration.setAlgorithmType(AlgorithmType.byString(getOption(argsCommandLine, ALG)));
        configuration.setEncodingMode(CipherMode.byString(getOption(argsCommandLine, ENC_MODE)));
        configuration.setPathInputFile(getOption(argsCommandLine, INPUT));
        configuration.setPathOutputFile(getOption(argsCommandLine, OUTPUT));
        String key = getOption(argsCommandLine, KEY);
        if (key != null) {
            configuration.setKey(Integer.parseInt(key));
        }
        return configuration;

    }
}
