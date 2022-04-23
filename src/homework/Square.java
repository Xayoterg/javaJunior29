package homework;

public class Square {
    private String name;
    private int length;
    private String consists;
    private String pathToImage;

    public Square() {

    }
    public Square(String name,int radius,String consists, String pathToImage){
        this.name=name;
        this.length=radius;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return length;
    }

    public void setRadius(int radius) {
        this.length = radius;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getConsists() {
        return consists;
    }

    public void setConsists(String consists) {
        this.consists = consists;
    }
}
