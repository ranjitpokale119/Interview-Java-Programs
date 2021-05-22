package com.Java8.optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String[] strArr = new String[10];

        withOptionalClass(strArr);
        withoutOptionalClass(strArr); // This will throw NullPointerException

    }

    private static void withOptionalClass(String[] strArr) {
        System.out.println("Inside withOptionalClass method");
        Optional<String> stringOptional = Optional.ofNullable(strArr[5]);
        if (stringOptional.isPresent()) {
            String sa = strArr[5].toLowerCase();
        } else
            System.out.println("string value is not present");
    }

    private static void withoutOptionalClass(String[] strArr) {
        System.out.println("Inside withoutOptionalClass method");
        String s = strArr[5].toLowerCase(); // This will throw NullPointerException
    }
}
