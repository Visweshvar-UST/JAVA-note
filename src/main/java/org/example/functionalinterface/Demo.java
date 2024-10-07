package org.example.functionalinterface;

public class Demo {
    public static void main(String[] args) {
        // the conventional way
        Operation add1 = new Addition();
        System.out.println(add1.operate(1,2));

        // using anonymous class
        Operation add2 = new Operation() {
            @Override
            public int operate(int num1, int num2) {
                return num1+num2;
            }
        };
        System.out.println(add1.operate(1,2));
    }
}
