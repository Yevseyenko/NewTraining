package module1;

public class FinalClassSample {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printSomething("Something");
    }

    public void printSomething(String something) {
        System.out.println(something);
    }
}


class ChildClass extends FinalClassSample {

}