package Lambdas;

import functionalInterfaces.Sayable;

public class LambdaExpressionExample8 {
    public static void main(String[] args) {
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + "message";
            return str2;
        };
        System.out.println(person.say("time is precious"));
    }
}
