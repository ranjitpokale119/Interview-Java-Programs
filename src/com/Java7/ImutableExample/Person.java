package com.Java7.ImutableExample;

/*In order to create an immutable class, you should follow the below steps:

Make your class final, so that no other classes can extend it.

Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.

Don’t expose setter methods.

When exposing methods which modify the state of the class, you must always return a new instance of the class.

If the class holds a mutable object:
Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
Make sure to always return a clone copy of the field and never return the real object instance.
*/
public final class Person {

    final int a = 10;
    private String name;
    private final Address address;


    private Person(String name, Address address) {
        this.name = name;
        this.address = address.clone();
    }

    public Address getAddress() {
        return address.clone();
    }

    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }
}

class Address implements Cloneable {

    private int id;
    private String addressCity;

    public int getId() {
        return id;
    }

    public String getAddressCity() {
        return addressCity;
    }


    @Override
    protected Address clone() {
        try {
            return (Address) super.clone();

        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        return new Address();
    }
}

