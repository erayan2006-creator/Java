package Ayan;

public class IF {
    public static void main(String[] args) {
        // and = &&
        // or = ||
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        if (20<10 && 90>20) {
            System.out.println("Hello");
        } else if (50<40 || 60>59) {
            System.out.println(2);
        } else {
            System.out.println("Hell");
        }
        System.out.println(a);
        System.out.println(b);
    }
}
