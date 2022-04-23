package lesson7;

public class User {     //User>пользеватель
    private String username;//имя пользевателя
    private String name;
    private int points;//балы
    private String pathToAvatar;//путь к аватарки




    public User() {
    }

    public User(String username, String name, int points) {
        this.username = username;
        this.name = name;
        this.points = points;
    }
    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }
}
