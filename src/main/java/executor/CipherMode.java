package executor;

public enum CipherMode {
    ENCODER("enc"),
    DECODER("dec");

    String mode;

    CipherMode(String mode) {
        this.mode = mode;
    }

    public static CipherMode byString(String mode) {
        for (CipherMode value : values()) {
            if (value.mode.equals(mode)) {
                return value;
            }
        }
        throw new RuntimeException("Unknown operation mode " + mode);
    }
}
