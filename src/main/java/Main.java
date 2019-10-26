import functionalInterfaces.MyNumber;
import model.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //reference on functional interface
        MyNumber myNum;
        Double d = (Double)null;
        System.out.println(d);
        Integer integer = null;
        int i = integer;

        //here lambda expression just stay constant expression
        //When it assign to reference variable myNum, it seams
        //that example of class, in which lambda-expression realize
        //method getValue() from functional interface MyNumber
        myNum = () -> 123.45;
        //to call method getValue(), represented
        // assigned before lambda-expression
        System.out.println("Fixed vaalue: " + myNum.getValue());
        //And herer we use more complicated expression
        myNum = () ->Math.random()*100;
        //In the next lines of code we call lambda-expression
        //from previous list of code
        System.out.println("Random value: " + myNum.getValue());
        System.out.println("Another one random value " + myNum.getValue());
        //Lambda-expression have to be compartible with abstract method
        //defined in functional interface.
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21));

        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("hi");
        System.out.println("After");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
