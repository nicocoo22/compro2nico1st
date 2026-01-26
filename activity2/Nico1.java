import java.util.*;
public class Nico1 {
    public static double sumColumn(double[][] m, int columnIn) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIn];
        }
        return sum;
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int j = 0; j < m.length; j++){
            sum += m[j][j];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] matrix3by4 = new double[3][4];
        double[][] matrix4by4 = new double[4][4];

        System.out.println("Enter a 3 by 4 matrix row by row");

        for (int i = 0; i < matrix3by4.length; i++) {
            for (int j = 0; j < matrix3by4[i].length; j++) {
                matrix3by4[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matrix3by4.length; i++) {
            System.out.println("The sum of column " + i + "is " + sumColumn(matrix3by4, i));
        }
    }
}

