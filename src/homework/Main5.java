package homework;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 45, 64, 3, 5,};
int sumplus=0;
        for (int i = 1; i < array.length-1; i++) {
            if ((array[i-1]+array[i+1])%2==0)

            {
                System.out.println(array[i]);


            }
        }
    }
}


