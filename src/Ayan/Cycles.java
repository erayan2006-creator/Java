package Ayan;

import java.util.Scanner;
public class Cycles {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input random number that bigger than 1: ");
        int a = x.nextInt();
        while (a>=1) {
            System.out.print(a + " ");
            a--; // a-- = a=a-1
        }
        System.out.println("");
        while (a<=20) {
            System.out.print(a + " ");
            a++; // a++ = a=a+1
        }
        System.out.println("");
        for (int i = 1; i<11; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("");
        for (int i =11; i<21; i+=3) {
            System.out.print(i+ " ");
        }
        System.out.println("");
        do {
            System.out.println("YES");
        } while (10<5); // тот же цикл что и while, но даже если условие будет неправильным то он выполнится один раз
    }
}
