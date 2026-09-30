package Ayan;

public class Lambda {
    public static void main(String[] args){
        Mathematics s = (a,b) -> a+b;
        Mathematics d = (a,b) -> a*b;
        System.out.println(d.sum(50,30));
        System.out.println(s.sum(50,30));
    }
}
