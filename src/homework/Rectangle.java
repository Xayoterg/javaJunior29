package homework;

public class Rectangle {
    private String name;
    private int length;
    private String consists;
    private String pathToImage;

    public Rectangle(){

    }
    public Rectangle(String name,int length,String consists,String pathToImage){
        this.name=name;
        this.length=length;
        this.consists=consists;


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

    public String getConsists() {
        return consists;
    }

    public void setConsists(String consists) {
        this.consists = consists;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }
}
