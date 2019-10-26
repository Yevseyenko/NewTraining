package module1;

public class Main {
    public static void main(String[] args) {
        MyClass myObject1 = new MyClass("First");
        MyClass.printAmountOfObjects();

        myObject1.destroy();
        MyClass.printAmountOfObjects();

        MyClass myObject2 = new MyClass("Second");

        myObject1.printName();
        myObject2.printName();

        myObject1.destroy();


        myObject1.printAmountOfObjects();
    }
}
