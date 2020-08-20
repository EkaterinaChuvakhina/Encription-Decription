package encryptdecrypt.encoding;

public interface EncodingMethod {
    String encode(String data, int key);

    String decode(String data, int key);
}

