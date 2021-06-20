package com.trickyPrograms;
//Is the below code written correctly? If yes, what will be the output?
class A {
    static void staticMethod() {
        System.out.println("Static Method1");
    }
}

public class MainClass {
    public static void main(String[] args) {
        A a = null;
        System.out.println("in main");
        a.staticMethod();
    }
}
