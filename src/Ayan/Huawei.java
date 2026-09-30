package Ayan;

public class Huawei extends Phone implements Actions{
    public Huawei() {}

    public Huawei(String name, String country, double weight, String color) {
        super(name, country, weight, color);
    }

    @Override
    public void getInfo() {
        System.out.println("THIS IS HUAWEI");
    }

    @Override
    public String Country() {
        return getCountry();
    }

    @Override
    public void Name(){
        System.out.println("Huawei");
    }

    @Override
    public void get() {
        System.out.println("T");
    }
}
