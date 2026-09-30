package Ayan;

public class iPhone extends Phone implements Actions{
    // При наследовании вся информация, что есть в классе Phone принадлежит классу iPhone.
    public iPhone() {}

    public iPhone(String name, String country, double weight, String color) {
        super(name, country, weight, color);
    }

    @Override
    public void getInfo() {
        System.out.println("THIS IS iPHONE!");
    }

    @Override
    public String Country() {
        return getCountry();
    }

    @Override
    public void Name(){
        System.out.println("iPhone");
    }

    @Override
    public void get() {
        System.out.println("G");
    }
}
