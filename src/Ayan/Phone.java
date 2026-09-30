package Ayan;
public abstract class Phone implements Actions {
    private String name; // if argument 'name' is private you can use it only in class Phone
    // У нас есть папка src. Внутри папки src есть пакет Ayan. Внутри пакета Ayan мы создаём классы.
    // Если переменная является public, то мы можем её использовать АБСОЛЮТНО ВЕЗДЕ.
    // Обычная переменная называется default. Её мы можем использовать только в одном пакете.
    // Если переменная является protected, то её мы можем использовать только в одном пакете либо если у двух классов один родитель.
    // Если переменная является final, то её значение невозможно изменить. Если класс является final, то его нельзя наследовать (extends).
    // Если переменная или метод являются static, то они принадлежат классу, но не объекту и вызывать их мы можем только с помощью классов.
    private String country;
    private double weight;
    private String color;

    public Phone() {
        this.name="Aiko";
        this.country = "USA";
        this.weight = 3.14;
        this.color = "White";
    }

    public Phone(String name, String country, double weight, String color) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.color = color;
    }
// Мы используем метод get, чтобы использовать переменные private в других классах.
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    public String getCountry() {return country;}
// Мы используем метод set, чтобы мы могли вводить данные в переменные private, не используя конструктор this.
    public void setName(String name) {
        this.name=name;
    }
    public void setWeight(double weight) {
        this.weight=weight;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public void setCountry(String country) {this.country=country;}
    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
    abstract void getInfo();

    abstract String Country();

    public void Name(){
        System.out.println("Phone");
    }
}