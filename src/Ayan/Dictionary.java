package Ayan;
import java.util.HashMap;
public class Dictionary {
    public static void main(String[] args) {
        HashMap<String,Integer> person = new HashMap<>();
        // String is a type of (gender, name and age)
        // Integer is a type of (12, 20, 45)
        person.put("gender", 12);
        person.put("age", 20);
        person.put("name", 45);
        person.put("name", 44);
        System.out.println(person);
        for (String k:person.keySet()){
            System.out.println(k + " "+ person.get(k));
        }
        // You can work with objects too
        HashMap<Phone,Samsung> s = new HashMap<>();

    }
}
