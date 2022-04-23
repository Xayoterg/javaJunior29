package lesson5;

public class StringUtils {
    public static int countCharsFromText(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentCh = text.charAt(i);
            if (ch == currentCh) {
                count++;

            }
        }
        return count;
    }

    public static void printReverse(String text) {
        for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text.charAt(i));
    }

}




/**
 * формула создание метода
 * 1-модификатор доступа
 * public-виден внутри воего проекта
 * packege-
 * protected-
 * 2-static
 * private-
 * 4 -
 * void
 * 5- входящие параметры
 */

//создадим метод который принемает те