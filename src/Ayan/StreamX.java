package Ayan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamX {
    public static void main(String[] args){
        int[] nums = {1, 5, 3, -23, 232, 3, 99, -5, -53, 98};
        long positiveNums = IntStream.of(nums).filter(n -> n > 0).count();
        System.out.println(positiveNums);

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Ilyas", "Aybek", "Amanzhan", "Assylkhan", "Azamat");
        ArrayList<String> q = names;
        names.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

        // Поток во второй раз использовать нельзя!!!
        q.stream().forEach(a -> System.out.println(a.toLowerCase()));
        // map() превращает из одного элемента в другой
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream().map(x -> x * 2).forEach(x -> System.out.println(x));
        // flatMap() превращает из одного элемента в несколько
        ArrayList<Phone> items = new ArrayList<>();
        Collections.addAll(
                items,
                new iPhone("IPhone", "13 Pro Max", 1200, "blue"),
                new Huawei("XIAOMI", "Redmi Note 8", 300, "red"),
                new Samsung("Samsung", "Galaxy Note 18", 800, "purple")
        );

        items.stream()
                .flatMap(item -> Stream.of(
                        item.getName() + " for " + item.getWeight() + " USD",
                        item.getName() + " for " + item.getWeight() * 2 + " KZT"
                ))
                .forEach(item -> System.out.println(item));
    }
}
