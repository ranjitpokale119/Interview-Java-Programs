package DesignPatternsInJava.singleton;

/*
* As we know that using the Eager Initialization method to create a singleton class may lead to
* unnecessary creation of an object, whether the application is using it or not. So, to overcome
* this problem, there is another technique to create a singleton class i.e., Lazy Initialization method.

The Lazy Initialization method delays the instantiation of the class until it
* is needed. In other words, the object is created only if it is required.
* This method helps in avoiding unnecessary creation of the class instance.
*
* Advantages
The creation of an object takes place only when it is required. This prevents the wastage of resources and CPU time.
Exception handling is also possible with this technique.
*
Disadvantages
There is a need to check the condition of null each time.
We cannot access the object of the class directly.
* */
public class LazyInitialization {

    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static LazyInitialization instance;
    public String string;

    private LazyInitialization() {
        // private constructor
        string = "Welcome to TechVidvan's Tutorial of Java";
    }

    //method to return instance of class
    public static LazyInitialization getInstance() {
        if (instance == null) {
            // if instance is null, initialize
            instance = new LazyInitialization();
        }
        return instance;
    }

    public static void main(String args[]) {
        LazyInitialization text = LazyInitialization.getInstance();
        //original string
        System.out.println("The String is:");
        System.out.println(text.string);
    }
}
