package Ayan;
import java.util.Scanner;
import java.util.Arrays;
public class Function {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.next();
        int a = x.nextInt();
        char i[] = {'A', 'y', 'a', 'n'};
        f(s, a, i);

        int [] array1 = {1, 2, -100, 200, -999};
        int [] array2 = {1, 1000, 2, -100, 200, -999};
        int [] array3 = {1, 2, -100, 200, -999, 999};

        System.out.println(getMaxNumberInArray(array1));
        System.out.println(getMaxNumberInArray(array2));
        System.out.println(getMaxNumberInArray(array3));
        just(3,"rt");
    }

    public static void f(String s, int a, char[] i) { // void function
        System.out.println(s + a + Arrays.toString(i));
    }

    static void just(int h, String t) {
        System.out.println(h + t);
    }

    public static int getMaxNumberInArray(int[] mas) { // returning function

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > max) {
                max = mas[i];
            }
        }

        return max; // обязательный элемент для returning function
    }
}