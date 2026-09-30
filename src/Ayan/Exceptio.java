package Ayan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptio {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Phone o = null;
        try {
            System.out.println(o.getColor());
        } catch (NullPointerException n){
            System.out.println("Object is empty");
        }

        try {
            System.out.println(5/0);
        } catch (ArithmeticException r){
            System.out.println("You can't divide by 0");
        }

        try {
            String x = "Ayan";
            System.out.println(x.charAt(4));
        } catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            int a = s.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Wrong input");
        } finally {
            System.out.println("FINAL");
        }

        try {
            String x = "Ayan";
            System.out.println(x.charAt(3));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("FALSE");
        } finally {
            System.out.println("FINAL");
        }

        try {
            String x = "Ayan";
            System.out.println(x.charAt(4));
            int[] m = {1, 2, 3};
            System.out.println(m[9]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("FALSE");
        } catch (ArrayIndexOutOfBoundsException w){
            System.out.println("TRUE");
        }
        System.out.println("END");
    }
}
