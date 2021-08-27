package DesignPatternsInJava.singleton;
/*
* 6. Static Block Initialization Method

The Static Block Initialization method in Java is similar to the Eager Initialization method.
* Actually, this method is the sub-part of the Eager Initialization method.
* They differ with each other in the fact that the object creation for this class takes place
* within the static block.

This method also provides the functionality of Exception Handling.
* As the object is created within the static block, we can have access to its creation. We can use this technique when we know that exceptions may occur while creating an object of the class with the Eager Initialization method.
*
*
* Advantages
Very simple to implement.
No need to implement getInstance() method. We can access the instance directly.
Exceptions can be handled in static blocks.
Disadvantages
This method may result in wastage of resources. The reason is that the instance of a class is always created,
*  whether required or not.
There is also the wastage of CPU time in the unnecessary creation of instances.
* */
public class StaticBlockInitialization {

    //Static Block Initialization
    private static StaticBlockInitialization instance;
    private StaticBlockInitialization()
    {
    }
    //exception handling within static block
    static
    {
        try
        {
            instance = new StaticBlockInitialization();
        } catch (Exception e)
        {
            throw new RuntimeException("Exception occured while creating a Singleton Class");
        }
    }
    public static StaticBlockInitialization getInstance()
    {
        return instance;
    }
}
