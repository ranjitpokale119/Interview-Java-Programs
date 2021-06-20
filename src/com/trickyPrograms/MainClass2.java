package com.trickyPrograms;

//3) What will be the output of the following program?
class Aa {
    static int i = 1111;

    static {
        System.out.println("Inside Aa's Static Block : This will run first");
        i = i-- - --i;
    }

    {
        System.out.println("Inside Aa's Normal Block : This will run third");
        i = i++ + ++i;
    }
}

class B extends Aa {
    static {
        System.out.println("Inside B's Static Block : This will run second");
        i = --i - i--;
    }

    {
        System.out.println("Inside Ba's Normal Block : This will run forth");
        i = ++i + i++;
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Inside main : " + b.i);
    }
}