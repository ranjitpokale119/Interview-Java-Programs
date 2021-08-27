package DesignPatternsInJava.singleton;
/*
* 3. Thread Safe Singleton Method
A thread-safe singleton method creates a Singleton class even in a multithreaded environment.
* We need to mark the getInstance() method ‘synchronized’. Marking this method as synchronized
* ensures that multiple threads can’t access it simultaneously
*
* Advantages
Lazy initialization is possible with the Thread-safe method.
It is also thread-safe.
*
Disadvantages
The getInstance() method is synchronized, which slows down the performance of
* the application as it restricts the m ultiple threads to be accessed
* simultaneously.
* */
public class ThreadSafeSingleton {

    //Thread Safe Singleton
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton()
    {
        // private constructor
    }
    //Making the getInstance method as synchronized
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
