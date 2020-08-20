package encryptdecrypt.encoding;

public class EncodingUnicode implements EncodingMethod {

    @Override
    public String encode(String data, int key) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((letters[i] + key) % 255);
        }

        return new String(letters);
    }

    @Override
    public String decode(String data, int key) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((letters[i] - key) % 255);
        }
        return new String(letters);
    }
}