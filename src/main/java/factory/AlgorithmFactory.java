package factory;

import algorithm.Algorithm;
import algorithm.ShiftAlgorithm;
import algorithm.UnicodeAlgorithm;
import algorithm.AlgorithmType;

public class AlgorithmFactory {
    public static Algorithm create(AlgorithmType type, int key) {
        switch (type) {
            case UNICODE:
                return new UnicodeAlgorithm(key);
            case SHIFT:
                return new ShiftAlgorithm(key);
            default:
                throw new RuntimeException("Unknown algorithm type");
        }
    }
}
