package Ayan;
import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int [][] a = new int[2][2];
        int [][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        a[0][1] = 2;
        a[0][0] = 1;
        a[1][0] = 3;
        a[1][1] = 4;
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
    }
}
