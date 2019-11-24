package Lambdas;

import functionalInterfaces.Drawable;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = new Drawable() {
            @Override
            public void draw(int v) {
                System.out.println("Drawing " + width);
            }
        };
        d.draw(3);
    }
}
