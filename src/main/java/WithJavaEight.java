import model.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WithJavaEight {
    public static void main(String [] args){
        List<User> users = Arrays.asList(
          new User("John",28),
          new User("Jane",35),
          new User ("Alex",21));
        System.out.println("Before sort:");
        for(User user: users){
            System.out.println(user);
            System.out.println("2");
        }

        Collections.sort(users,(o1,o2)->o1.getAge()-o2.getAge());
        System.out.println("After");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
