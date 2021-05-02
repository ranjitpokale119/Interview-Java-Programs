package Java8Features.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate4 {
    public static void main(String[] args) {

        Predicate<String> startWithA = x -> x.startsWith("A");
        Predicate<String> lengthIs2 = x -> x.length() == 2;

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        //negateMethod used to ignore those values which are
        List<String> negateResult = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println("negateResult = " + negateResult);

        List<String> andPredicateResult = list.stream().filter(lengthIs2.and(startWithA)).collect(Collectors.toList());
        System.out.println("andPredicateResult = " + andPredicateResult);


    }
}
