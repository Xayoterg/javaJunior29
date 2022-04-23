package homework;

public class Triangle {
    private String name;
    private int length;
    private String consist;
    private String pathToImage;

    public Triangle() {

    }

    public Triangle(String name, int length, String consist) {
        this.name = name;
        this.length = length;
        this.consist = consist;
    }

    public Triangle(String name, int length, String consist, String pathToImage){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getConsist() {
        return consist;
    }

    public void setConsist(String consist) {
        this.consist = consist;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }
}
