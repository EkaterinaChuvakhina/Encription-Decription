package encryptdecrypt.encoding;

public class ShiftEncoding implements EncodingMethod {
    @Override
    public String encode(String data, int key) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                if (Character.isUpperCase(letters[i])) {
                    letters[i] = (char) ('A' + ((letters[i] - 'A' + key) % 26));
                } else {
                    letters[i] = (char) ('a' + ((letters[i] - 'a' + key) % 26));
                }
            }
        }
        return new String(letters);
    }

    @Override
    public String decode(String data, int key) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                if (Character.isUpperCase(letters[i])) {
                    letters[i] = (char) ('Z' + ((letters[i] - 'Z' - key) % 26));
                } else {
                    letters[i] = (char) ('z' + ((letters[i] - 'z' - key) % 26));
                }
            }
        }
        return new String(letters);
    }
}