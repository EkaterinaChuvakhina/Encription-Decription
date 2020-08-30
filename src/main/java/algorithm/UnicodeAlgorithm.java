package algorithm;

public class UnicodeAlgorithm implements Algorithm {
    private int key;

    public UnicodeAlgorithm(int key) {
        this.key = key;
    }

    public String encode(String data) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((letters[i] + key) % 255);
        }

        return new String(letters);
    }

    public String decode(String data) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((letters[i] - key) % 255);
        }
        return new String(letters);
    }
}