package Lambdas;

import functionalInterfaces.Sayable;

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Sayable s = (f)->{
            return "I have nothing to say";
        };
        System.out.println(s.say("a"));
    }
}
