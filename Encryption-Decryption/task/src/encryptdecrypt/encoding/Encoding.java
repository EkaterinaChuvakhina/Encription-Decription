package encryptdecrypt.encoding;

public class Encoding {
    EncodingMethod method;

    public void setMethod(EncodingMethod method) {
        this.method = method;
    }

    public String encode(String data, int key) {
        return this.method.encode(data, key);
    }

    public String decode(String data, int key) {
        return this.method.decode(data, key);
    }
}


