package Ayan;

public class Classes {
    public static void main(String[] args) {
        Phone phone1 = new iPhone("Ayan", "USA", 300, "RED");
        // С помощью конструктора this, мы можем вводить данные в переменные private
        Phone phone2 = new Samsung();
        Phone phone3 = new Huawei();
        phone2.setCountry("Kazakhstan");
        phone3.setName("Henry");
        phone3.setCountry("China");
        phone3.setWeight(500);
        phone3.setColor("BLUE");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.getInfo();
        Phone[] phones = new Phone[3];
        phones[0]=phone1;
        phones[1]=phone2;
        phones[2]=phone3;
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getName() + " " + phones[i].getColor() + " " + phones[i].getWeight() + " " + phones[i].getCountry());
            System.out.println(phones[i].Country());
            phones[i].Name();
            phones[i].get();
        }
        System.out.println(phone1 instanceof Huawei);
    }
}
