package Lambdas;

import functionalInterfaces.Sayable;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        Sayable s1 = (n)->{
            return  "Hello "+n;
        };
        System.out.println(s1.say("Limb"));

        Sayable s2 = sd->{
            return "Hello"+sd+"fre";
        };
        System.out.println(s2.say(" Wer"));
    }
}
