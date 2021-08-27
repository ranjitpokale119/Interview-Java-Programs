package DesignPatternsInJava.singleton;
/*
* Before Java 5, there were a lot of issues in the memory model. Therefore, the above methods of creating a Singleton class failed in specific scenarios in a multithreaded environment.

So, the concept of Bill Pugh Method came into the picture that used the idea of inner static classes for a singleton. Bill Pugh discovered this method; therefore it is named as Bill Pugh Implementation Method.
* */
public class BillPughMethod {
    // Java code for Bill Pugh Singleton Implementation
    private BillPughMethod()
    {
        // private constructor
    }
    // Inner class to provide instance of class
    private static class BillPughSingleton
    {
        private static final BillPughMethod INSTANCE = new BillPughMethod();
    }
    public static BillPughMethod getInstance()
    {
        return BillPughSingleton.INSTANCE;
    }

}
