package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] nums1 = {{2, 1, 5, 4},
                            {1, 4, 3, 6},
                            {5, 6, 6, 4},};
        Matrix matrix1=new Matrix(nums1);


        double[][] nums2 = {{4, 3, 7, 2,},
                            {1, 2, 3, 2},
                            {4, 8, 3, 1},};

        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultAdd=matrix1.add(matrix2);



        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());
        System.out.println(matrix1.getValueAt(0, 0));


    }

}
