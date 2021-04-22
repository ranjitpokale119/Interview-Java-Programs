package javabrains;

public class MyClass implements MyInterface1, MyInterface2 {

    public void show() {
        System.out.println("Hello world..");
    }

    @Override
    public void print() {
        System.out.println("In printing method...");
    }

    public static void main(String[] args) {
        MyInterface1 ls = new MyClass();
        ls.print();
        ls.show();
    }

}

interface MyInterface1 {
    void show();
    void print();
}

interface MyInterface2 {
    void show();
}