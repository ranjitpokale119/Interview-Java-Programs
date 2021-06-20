package com.trickyPrograms;

// Java program for the above approach

public class RemoveUnderscore {

    // Function to convert snake case
    // to camel case
    public static String
    snakeToCamelUsingStringBuilder(String str) {
        // Capitalize first letter of string
        str = str.substring(0, 1).toUpperCase()
                + str.substring(1);

        // Convert to StringBuilder
        StringBuilder builder
                = new StringBuilder(str);

        // Traverse the string character by
        // character and remove underscore
        // and capitalize next letter
        for (int i = 0; i < builder.length(); i++) {

            // Check char is underscore
            if (builder.charAt(i) == '_') {

                builder.deleteCharAt(i);
                builder.replace(
                        i, i + 1,
                        String.valueOf(
                                Character.toUpperCase(
                                        builder.charAt(i))));
            }
        }

        // Return in String type
        return builder.toString();
    }

    // Driver Code
    public static void main(String[] args) {

        // Given String
        String str = "geeks_for_geeks";

        String str1= "geeks_for_geeks1";
        // Function Call
        str = snakeToCamelUsingStringBuilder(str);
        // Modified String
        System.out.println(str);

        // Function Call
        str1 = snakeToCamelUsingWhileLoop(str1);
        // Modified String
        System.out.println(str1);
    }

    private static String snakeToCamelUsingWhileLoop(String str) {
        // Capitalize first letter of string
        str = str.substring(0, 1).toUpperCase()
                + str.substring(1);

        // Run a loop till string
        // string contains underscore
        while (str.contains("_")) {

            // Replace the first occurrence
            // of letter that present after
            // the underscore, to capitalize
            // form of next letter of underscore
            str = str
                    .replaceFirst(
                            "_[a-z]",
                            String.valueOf(
                                    Character.toUpperCase(
                                            str.charAt(
                                                    str.indexOf("_") + 1))));
        }

        // Return string
        return str;
    }
}
