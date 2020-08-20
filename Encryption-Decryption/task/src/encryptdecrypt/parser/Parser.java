package encryptdecrypt.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static final String DATA = "-data";
    public static final String INPUT = "-in";
    public static final String OUTPUT = "-out";
    public static final String ENC_MODE = "-mode";
    public static final String ALG = "-alg";
    public static final String KEY = "-key";

    private static String getIndex(List<String> argsCommandLine, String arg) {
        if (argsCommandLine.contains(arg)) {
            return argsCommandLine.get(argsCommandLine.indexOf(arg) + 1);
        } else return null;
    }

    public static ParseHolder parse(String[] args) {
        ParseHolder parseHolder = new ParseHolder();
        List<String> argsCommandLine = new ArrayList<>(args.length);
        argsCommandLine.addAll(Arrays.asList(args));

        parseHolder.setData(getIndex(argsCommandLine, DATA));
        parseHolder.setAlgorithmName(getIndex(argsCommandLine, ALG));
        parseHolder.setEncodingMode(getIndex(argsCommandLine, ENC_MODE));
        parseHolder.setPathInputFile(getIndex(argsCommandLine, INPUT));
        parseHolder.setPathOutputFile(getIndex(argsCommandLine, OUTPUT));
        if (getIndex(argsCommandLine, KEY) != null) {
            parseHolder.setKey(Integer.parseInt(getIndex(argsCommandLine, KEY)));
        }
        return parseHolder;

    }
}