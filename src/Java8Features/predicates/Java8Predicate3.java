package Java8Features.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate3 {
    public static void main(String[] args) {

        Predicate<String> lengthIs3Predicate = x -> x.length() == 3;
        Predicate<String> startWithAPredicate = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(lengthIs3Predicate.or(startWithAPredicate))
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
