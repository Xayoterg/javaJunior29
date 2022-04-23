package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int[][] chees = new int[8][8];
        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees.length; j++) {
                if ((i + j) -7 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
//if (i !=  j) {System.out.print(chees[i][j] + " ");