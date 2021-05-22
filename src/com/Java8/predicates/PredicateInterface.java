package com.Java8.predicates;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean test(T t);
}