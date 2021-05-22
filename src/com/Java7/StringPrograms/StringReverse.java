package StringPrograms;

public class StringReverse {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static String getReversedStrUsingCharAt(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.reverseString("my name is khan"));
        System.out.println(StringReverse.reverseString("I am sonoo jaiswal"));
        System.out.println("Reverse of the string Using chaAt method: ");
        System.out.println(StringReverse.getReversedStrUsingCharAt("ashish"));
    }
}