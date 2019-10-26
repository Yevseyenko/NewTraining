package model;

import functionalInterfaces.NumericTest;

public class LambdaExpression {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("number 10 even");
        if (!isEven.test(9)) System.out.println("number 9 isnt even");
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("Number 1 is negative");
        if (isNonNeg.test(-1)) System.out.println("Number -1 is negative");
    }
}
