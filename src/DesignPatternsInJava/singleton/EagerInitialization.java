package DesignPatternsInJava.singleton;
/*
* 1. Eager Initialization Method
The most basic and simple technique to create a Singleton class is the Eager Initialization method.
* With this approach, the object or the instance of the class is created when JVM loads memory to the object.
* We accomplish this by directly assigning the reference to the object.

We can use this technique when we know that the program is always going to use
* the object/instance of this class. Also, we  use this technique when the cost
* of creating the instance is not too high in terms of resources and time.
* */
public class EagerInitialization {

    //Instance will be created at load time
    private static EagerInitialization obj = new EagerInitialization();
    public String string;

    //Creating private constructor
    private EagerInitialization() {
        string = "Welcome to TechVidvan's Tutorial of Java";
    }

    //Declaring static method
    public static EagerInitialization getInstance() {
        return obj;
    }

    public static void main(String args[]) {
        EagerInitialization text = EagerInitialization.getInstance();
        //original string
        System.out.println("Original String:");
        System.out.println(text.string);
        //text in upper case
        System.out.println("String in Upper Case:");
        text.string = (text.string).toUpperCase();
        System.out.println(text.string);
    }
}
