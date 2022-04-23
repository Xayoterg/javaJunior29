package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Tovar tovar=new Tovar("мышка",2000);
        Proizvoditel lg=new Proizvoditel("LG");
        lg.setDescription("это корейский производитель");//описание можно установить с помшью>setDescription
        lg.getPathToImage();
        tovar.setProizvoditel(lg);
        User user=new User("vasya pupkin","вася пупкин",100);
        user.getPathToAvatar();

        Otziv otziv=new Otziv();
        otziv.setUser(user);
        otziv.getRating();
        otziv.setMainText("покупал,все отлично!все работает");

        tovar.addOtzivToTovar(otziv);
        System.out.println();
    }
}
