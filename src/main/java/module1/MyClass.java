package module1;

public class MyClass {
    private static int amountOfObjects;
    public String name;
    public boolean isCreated;

    public MyClass(String name) {
        amountOfObjects++;
        this.name = name;
        this.isCreated = true;
    }

    public void destroy() {
        amountOfObjects--;
        this.isCreated = false;
    }

    public static void printAmountOfObjects() {
        System.out.println(amountOfObjects);
    }

    public void printName(){
        System.out.println(name);
    }
}
