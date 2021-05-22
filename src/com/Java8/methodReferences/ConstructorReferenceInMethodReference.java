package com.Java8.methodReferences;

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        /*There are Call by reference , call by value and now there is call by method*/
        //Traditional Syso
        System.out.print(msg);
        //Method reference syso
        //System.out::println(msg);  ---Not working
    }
}

public class ConstructorReferenceInMethodReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}