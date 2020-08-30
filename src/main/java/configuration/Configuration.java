package configuration;

import algorithm.AlgorithmType;
import executor.CipherMode;

public class Configuration {
    private String data;
    private Integer key;
    private String pathInputFile;
    private CipherMode encodingMode;
    private AlgorithmType algorithmType;
    private String pathOutputFile;

    public Configuration() {
        this.key = 0;
        this.encodingMode = CipherMode.ENCODER;
        this.algorithmType = AlgorithmType.SHIFT;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getPathInputFile() {
        return pathInputFile;
    }

    public void setPathInputFile(String pathInputFile) {
        this.pathInputFile = pathInputFile;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public CipherMode getEncodingMode() {
        return encodingMode;
    }

    public void setEncodingMode(CipherMode encodingMode) {
        this.encodingMode = encodingMode;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmType algorithmType) {
        this.algorithmType = algorithmType;
    }

    public String getPathOutputFile() {
        return pathOutputFile;
    }

    public void setPathOutputFile(String pathOutputFile) {
        this.pathOutputFile = pathOutputFile;
    }
}
