package com.Java7.GeneralPrograms;

class Parent {

    void show() {
        System.out.println("inside parent's show method");
    }

    void show1() {
        System.out.println("inside parent's independent show1 method");
    }
}

class Child extends Parent {

    public void show() {
        System.out.println("inside child's show method");
    }
}

public class ParentChild {
    public static void main(String[] args) {
        //Child c1 = (Child) new Parent();
        Parent p = new Child();
        p.show();
        p.show1();
        /*
         * p.show(); c.show(); p1.show();
         */
        //c1.show();
    }

}