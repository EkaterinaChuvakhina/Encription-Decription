package algorithm;

public class ShiftAlgorithm implements Algorithm {
    private int key;

    public ShiftAlgorithm(int key) {
        this.key = key;
    }

    public String encode(String data) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                if (Character.isUpperCase(letters[i])) {
                    letters[i] = (char) ('A' + ((letters[i] - 'A' + key) % 26));
                } else {
                    letters[i] = (char) (((letters[i] - 'a' + key) % 26) + 'a');
                }
            }
        }
        return new String(letters);
    }

    public String decode(String data) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                if (Character.isUpperCase(letters[i])) {
                    letters[i] = (char) ('A' + ((letters[i] - 'A' - key) % 26));
                } else {
                    letters[i] = (char) (((letters[i] - 'a' - key) % 26) + 'a');
                }
            }
        }
        return new String(letters);
    }
}