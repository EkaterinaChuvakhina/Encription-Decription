package encryptdecrypt.parser;

public class ParseHolder {
    private String data;
    private Integer key;
    private String pathInputFile;
    private String encodingMode;
    private String algorithmName;
    private String pathOutputFile;

    public ParseHolder() {
        this.key = 0;
        this.encodingMode = "enc";
        this.algorithmName = "shift";
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

    public String getEncodingMode() {
        return encodingMode;
    }

    public void setEncodingMode(String encodingMode) {
        this.encodingMode = encodingMode;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getPathOutputFile() {
        return pathOutputFile;
    }

    public void setPathOutputFile(String pathOutputFile) {
        this.pathOutputFile = pathOutputFile;
    }
}
