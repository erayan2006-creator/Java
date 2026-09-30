package Ayan;

public interface Actions {
    void get();
    int age=8;
    default int plus(int a, int b){
        return a+b;
    }
}
