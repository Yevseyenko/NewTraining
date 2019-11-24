package module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String [] names = {"Alexey","Alina", "Andrey"};
       List list = Arrays.asList(names);
        list =new ArrayList(list);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println(names[i]);
        }

        for (Object s :list){
           System.out.println(s.toString());
        }

        list.remove(3);
        list.forEach(s-> System.out.println(s));

        }
    }

