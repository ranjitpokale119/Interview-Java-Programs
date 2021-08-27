package DesignPatternsInJava.singleton;
/*
* In the Lazy Load method, the JVM will load static data members only when required. Thus, when the JVM loads the singleton class into the JVM, no object is created.
* */
public class LazyLoadMethod {

    //Lazy Load Method
    private LazyLoadMethod()
    {
    }
    private static class SingletonClassHolder
    {
        private static LazyLoadMethod instance= new LazyLoadMethod();
    }
    public static LazyLoadMethod getInstance()
    {
        return SingletonClassHolder.instance;
    }
}
