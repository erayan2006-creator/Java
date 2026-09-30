package Ayan;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(2+2);
        byte a = -128;
        byte b = 127;
        System.out.println(a);
        System.out.println(b);
        short c = 32767;
        short d = -32768;
        System.out.println(c);
        int e = 2147483647;
        long f = 9223372036854775807l;
        System.out.println(f);
        float g = 32767.56f;
        double h = 45;
        char i = 'A';
        boolean j = true;
        boolean k = 20>10;
        System.out.println(k);
        System.out.print("Hello, Bitlab! ");
        System.out.println("Hello, Bitlab!");
        // Если тип данных начинается с заглавной буквы, то он является сложный. Например: String
        String l = "Ayan is the best";
        Scanner x = new Scanner(System.in);
        System.out.print("Input random number: ");
        int s = x.nextInt();
        System.out.println(s);
        System.out.println((int) Math.pow(5,2));
        System.out.print("Input random one character: ");
        char y = x.next().charAt(0);
        System.out.println(y);
        System.out.print("You can input one sentence: ");
        String z = x.nextLine(); // we can input sentence
        System.out.println(z);
        System.out.println(Math.round(g*10000)/10000.0);
        System.out.println(Math.PI);
        /*
        Commentator
        */
    }
}
