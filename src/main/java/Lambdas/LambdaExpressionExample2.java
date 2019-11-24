package Lambdas;

import functionalInterfaces.Drawable;

public class LambdaExpressionExample2 {
    public static void main(String []args){
        int width = 10;
        Drawable d2 = (int a)->{
            System.out.println("Drawing "+ width);
        };
        d2.draw(3);
    }
}
