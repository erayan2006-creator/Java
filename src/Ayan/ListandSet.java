package Ayan;

import java.util.ArrayList;
import java.util.HashSet;

public class ListandSet {
    public static void main(String[] args){
        // int --> Integer. boolean--> Boolean
        ArrayList<Integer> a = new ArrayList<>(5);
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        a.add(100);
        a.add(500);
        System.out.println(a);
        Integer[] array = a.toArray(new Integer[0]);
        for (Integer n : array){
            System.out.println(n);
        }
        // У HashSet нету порядка
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(5);

        System.out.println(set);

    }
}
