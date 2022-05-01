package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilse implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1==null||number2==null");
        }
        double num1 = 0;
        try {


            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1-не число");
        }
        double num2 = 0;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2-не число");
        }
        if (num2 == 0.0) {
            throw new ArithmeticException("на ноль делить нельзя");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("text is null");
        }

        if (word == null) {
            throw new NullPointerException("word is null");
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < text.length() - word.length(); i++) {
            String wordIter = "";
            for (int j = 0; j < word.length(); j++) {
                wordIter += String.valueOf(text.charAt(i + j));
            }
            if (wordIter.equals(word)) {
                list.add(i);
            }
        }

        int[] numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }
        return numbers;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        List<Double> list = new ArrayList<>();

        String regularExpressionForDouble = "((\\d)+(\\.(\\d)+)?)";
        Matcher matcher = Pattern.compile(regularExpressionForDouble).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        if (list.isEmpty()) {
            throw new CustomException("Not fou234.9nd");
        }

        double[] numbers = new double[list.size()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = list.get(i);
        }

        return numbers;
    }
}




