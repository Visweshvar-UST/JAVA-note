package org.example.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Contest_1 {
    public static void main(String[] args) {
        Predicate<Integer> oddEven = (num) -> num%2 == 0;
        System.out.println(oddEven.test(5)?"Even":"Odd");
        Function<Integer, String> isEven = num -> (num%2==0)?"Even":"Odd";
        System.out.println(oddEven.test(2)?"Even":"Odd");

        Predicate<Integer> isPrime = (num) -> {
            for(int i = 2; i*i < num; i++){
                if(num%i==0) return false;
            }
            return true;
        };
        System.out.println(isPrime.test(5)?"Prime":"Not Prime");

        Predicate<String> isPalindrome = (str) -> {
            char[] inp = str.toCharArray();
            int l = inp.length;
            for (int i = 0; i < l/2; i++){
                if (inp[i] != inp[l-1-i]) return false;
            }
            return true;
        };
        System.out.println(isPalindrome.test("madam")?"Palindrome":"Not Palindrome");




    }
}
