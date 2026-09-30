package Ayan;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {6,19,26,9,46,8,5,65,90,25};
        String[] a = new String[5];
        a[0] = "56";
        a[1] = "6";
        a[2] = "3";
        a[3] = "2";
        a[4] = "1";
        System.out.println(a[0]);
        System.out.println(nums.length);
        System.out.println(Arrays.stream(nums).max().getAsInt());
        System.out.println(Arrays.stream(nums).min().getAsInt());
        a[0] = "67";
        System.out.println(a[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println(Math.random()); // 0 <= x < 1
        int min = 200;
        int max = 500;
        int x = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(x); // 200 <= x <= 500
        Arrays.sort(nums); // Сортирует по возрастанию
        System.out.println(Arrays.toString(nums));
    }
}
