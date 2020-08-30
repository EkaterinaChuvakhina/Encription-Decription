package executor;

import algorithm.Algorithm;

public class Executor {
    private final Algorithm algorithm;

    public Executor(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String execute(CipherMode mode, String data){
        switch (mode) {
            case ENCODER:
                return algorithm.encode(data);
            case DECODER:
                return algorithm.decode(data);
            default: throw new RuntimeException("Unknown cipher mode");
        }
    }
}
