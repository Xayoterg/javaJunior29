package lesson3;

import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        String emeil = "skkhd@fskdj@ldjf";
        String[] partsOfemeil = emeil.split("@");
        if (partsOfemeil.length == 1) {
            System.out.println("emeil не содержит собачки");
        }
        if (partsOfemeil.length > 2) {
            System.out.println("emeil содержит более 1 собачки");
            if (!emeil.matches("[а-яА-Я]"))

                System.out.println("emeil строки не содержит кирилицу ");

            if (!emeil.matches("[{}/?+<>&$#]")) {
                System.out.println("emeil не содержит символы{}/?+<>&$#");
                if (!emeil.contains("0")&&!emeil.contains("1")&&!emeil.contains("2")&&!emeil.contains("3")&&
                        !emeil.contains("4")&&!emeil.contains("5")&&!emeil.contains("6")&&!emeil.contains("7")&&
                        !emeil.contains("8")&&!emeil.contains("9")&&!emeil.contains("10")&&!emeil.contains("11")&&
                        !emeil.contains("12")&&!emeil.contains("13")&&!emeil.contains("14")&&!emeil.contains("15")&&
                        !emeil.contains("16"))
                    System.out.println("пароль не содержит цыфр");

                }
            }
        }
    }