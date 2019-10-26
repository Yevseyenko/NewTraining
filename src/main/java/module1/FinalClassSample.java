package module1;

public final class FinalClassSample {
    public static void main(String[] args) {
        FinalClassSample childClass = new FinalClassSample();
        childClass.printSomething("Something");
        childClass.printNothing();
    }

    public void printSomething(String something) {
        System.out.println(something);
    }

    public void printNothing(){
        System.out.println("Nothing");
    }
}

/*
class ChildClass extends FinalClassSample {
public void printSomethingg (String message){
    System.out.println(message+"was printed from child");
}

@Override
public void printNothing(){
    System.out.println("Wowowowowowowow!");
}
}
*/