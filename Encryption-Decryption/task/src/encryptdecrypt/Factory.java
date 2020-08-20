package encryptdecrypt;

import encryptdecrypt.encoding.EncodingMethod;
import encryptdecrypt.encoding.EncodingUnicode;
import encryptdecrypt.encoding.ShiftEncoding;

public class Factory {
    public static EncodingMethod create(String type) {
        if ("unicode".equals(type)) {
            return new EncodingUnicode();
        } else if ("shift".equals(type)) {
            return new ShiftEncoding();
        }
        throw new RuntimeException();
    }
}

