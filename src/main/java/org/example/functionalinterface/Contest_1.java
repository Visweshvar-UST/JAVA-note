package org.example.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Contest_1 {
    public static void main(String[] args) {
        Predicate<Integer> oddEven = (num) -> num%2 == 0;
        System.out.println(oddEven.test(5)?"Even":"Odd");
        Function<Integer, String> isEven = num -> (num%2==0)?"Even":"Odd";
        System.out.println(oddEven.test(2)?"Even":"Odd");

    }
}
