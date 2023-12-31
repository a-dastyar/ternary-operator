package com.campus.ternary;

public class TernaryOperator {

    public static void main(String[] args) {
        int num = 7;
        /*
            Ternary Operator in java is conditional expersstion
            that allows evlations based on a condition.
            syntax: Condition ? TrueCase : FalseCase
         */
        String result = isOdd(num) ? "odd" : "even";
        System.out.printf("The number is %s \n", result);
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
