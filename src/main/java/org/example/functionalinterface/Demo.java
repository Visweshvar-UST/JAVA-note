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
        System.out.println(add2.operate(1,2));
        // using lambda expression
        Operation add3 = (int num1, int num2) -> {
            return (num1 + num2);
        };
        System.out.println(add3.operate(1,2));

        Operation add4 = (int num1, int num2) -> (num1 + num2);
        System.out.println(add4.operate(1,2));

        Operation add5 = (n1, n2) -> (n2 + n2);
        System.out.println(add5.operate(1,2));

    }
}
