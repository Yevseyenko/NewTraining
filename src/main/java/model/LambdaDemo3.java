package model;

import functionalInterfaces.NumericTest2;

public class LambdaDemo3 {
    public static void main(String args[]) {
        //in this lamda expression we will verify if one number can multiple another
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("Number 2 is multiplier number 10");
        if (!isFactor.test(10, 3))
            System.out.println("something went wrong");
    }
}
