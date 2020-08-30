package algorithm;

public enum AlgorithmType {
    SHIFT("shift"),
    UNICODE("unicode");

    String type;

    AlgorithmType(String type) {
        this.type = type;
    }

    public static AlgorithmType byString(String type) {
        for (AlgorithmType value : values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        throw new RuntimeException("Unknown algorithm type " + type);
    }
}
