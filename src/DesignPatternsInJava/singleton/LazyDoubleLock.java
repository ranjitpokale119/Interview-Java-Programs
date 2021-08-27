package DesignPatternsInJava.singleton;
/*
* 4. Lazy Initialization with Double Lock Method
In this approach, we overcome the overhead problem of synchronized methods.
* Here, we do not synchronize the getInstance() method. Instead of making it synchronized,
* we enclose the code of creating objects within a synchronized block.

By doing this, only a minimum number of threads have to wait and that too only for
* the first time. This approach usually boosts the performance of the application.
*
* Advantages
Lazy initialization is possible.
It is also a thread-safe method.
Performance improves because of the synchronized block.
Disadvantages
It can affect the performance of the first time.
* */
public class LazyDoubleLock {

    // Java code to explain double-check locking private instance so that it can be
    // accessed by only by getInstance() method
    private static LazyDoubleLock instance;
    public String string;
    private LazyDoubleLock()
    {
        // private constructor
        string = "Welcome to TechVidvan's Java Tutorial";
    }
    public static LazyDoubleLock getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (LazyDoubleLock.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new LazyDoubleLock();
                }
            }
        }
        return instance;
    }
    public static void main(String args[ ])
    {
        LazyDoubleLock text = LazyDoubleLock.getInstance();
        //original string
        System.out.println("Original String:");
        System.out.println(text.string);
        //text in upper case
        System.out.println("String in Upper Case:");
        text.string = (text.string).toUpperCase();
        System.out.println(text.string);
    }
}
