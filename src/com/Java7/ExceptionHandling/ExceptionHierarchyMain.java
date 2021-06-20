package com.Java7.ExceptionHandling;

class Base extends Exception {
}

class Derived extends Base {
}

public class ExceptionHierarchyMain {

    public static void main(String[] args) {
        ExceptionHierarchyMain e = new ExceptionHierarchyMain();
        System.out.println("e = " + e.getIntFunc());
        print();
    }

    int getIntFunc() {
        try {
            throw new Derived();
            //return 11; // unreachable statement
        } catch (Base e) {
            System.out.println("in Base");
            return 12;
        } catch (Exception e) {
            System.out.println("in Exception");
            return 12;
        } finally {
            System.out.println("in finally");
            return 13;
        }
    }

    static void print() {
        System.out.println("true = " + true);
    }
}
