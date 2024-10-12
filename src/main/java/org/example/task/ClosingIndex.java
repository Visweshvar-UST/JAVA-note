package org.example.task;

import java.util.Arrays;

public class ClosingIndex {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4};

        int totProduct = Arrays.stream(arr).reduce(1,(a,b)-> a*b);
        arr = Arrays.stream(arr).map(ele -> totProduct/ele).toArray(Integer[]::new);
        System.out.println(totProduct);
        Arrays.stream(arr).forEach((e) -> System.out.print(e+" "));
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
