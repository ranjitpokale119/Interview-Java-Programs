package com.Java7.GeneralPrograms;

class A {
    int a;

    //A(){}
    A(int a) {
        this.a = a;
        System.out.println("In A :" + a);
    }

    public int getA() {
        return a;
    }
}

class B extends A {
    int b;

    B(int b) {
        super(b);// this line we should add because.
        // it will throw compiler time exception: There is no default constructor available in 'netcracker.A'
        //In parent child rel if you try to create and child's object with parameterized cons. you should
        // always invoke parent's obj implicitly ...thats why you need to call
        //  a. super(param) in case of A having param cons
        //  b. not add super in case of A having default cons.

        this.b = b;
        System.out.println("In B :" + b);
    }

    public int getB() {
        return b;
    }
}


public class ConstructorInvocation {
    public static void main(String[] args) {
        A a1 = new A(20);
        final A a = new B(20);
        System.out.println("main A" + a.getA());
        System.out.println("main B" + ((B) a).getB());
    }

}
