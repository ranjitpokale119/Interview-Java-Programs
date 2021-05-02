package StringPrograms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverseUsingJava8 {
    public static void main(String[] args) {
        System.out.println(reverse("Pankaj"));
    }

    public static String reverse(String string) {

        String reverse = Stream.of(string)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining());
        System.out.println("reverse = " + reverse);

        return reverse;
    }
}
