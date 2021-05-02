package Java8Features.predicates;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean test(T t);
}