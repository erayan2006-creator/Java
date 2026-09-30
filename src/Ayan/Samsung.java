package Ayan;

public class Samsung extends Phone implements Actions{
    public Samsung() {}

    public Samsung(String name, String country, double weight, String color) {
        super(name, country, weight, color);
    }

    @Override
    public void getInfo() {
        System.out.println("THIS IS SAMSUNG!");
    }

    @Override
    public String Country() {
        return getCountry();
    }

    @Override
    public void Name(){
        System.out.println("Samsung");
    }

    @Override
    public void get() {
        System.out.println("E");
    }
}
