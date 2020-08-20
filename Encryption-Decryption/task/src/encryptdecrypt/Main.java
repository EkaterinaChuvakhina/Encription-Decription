package encryptdecrypt;

import encryptdecrypt.encoding.EncodingMethod;
import encryptdecrypt.parser.ParseHolder;
import encryptdecrypt.parser.Parser;
import encryptdecrypt.reader.DataReader;
import encryptdecrypt.writer.DataWriter;

public class Main {
    public static void main(String[] args) {
        ParseHolder parseHolder = Parser.parse(args);
        EncodingMethod encodingMethod = Factory.create(parseHolder.getAlgorithmName());
        String res = null;
        if (parseHolder.getData() == null) {
            if (parseHolder.getPathInputFile() == null) {
                parseHolder.setData("");
            } else {
                parseHolder.setData(DataReader.read(parseHolder.getPathInputFile()));
            }
        }

        if ("enc".equals(parseHolder.getEncodingMode())) {
            res = encodingMethod.encode(parseHolder.getData(), parseHolder.getKey());
        } else if ("dec".equals(parseHolder.getEncodingMode())) {
            res = encodingMethod.decode(parseHolder.getData(), parseHolder.getKey());
        }

        if (parseHolder.getPathOutputFile() == null) {
            System.out.println(res);
        } else {
            DataWriter.write(parseHolder.getPathOutputFile(), res);
        }

    }
}

