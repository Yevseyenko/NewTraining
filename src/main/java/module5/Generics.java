package module5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List words = new ArrayList();
        words.add("Hello ");
        words.add("world!");
        String s = ((String)words.get(0)+(String)words.get(1));
        assert s.equals("Hello world!");

        //with generics
        List <String> words1 =new ArrayList<>();
        words1.add("Hello ");
        words1.add("world!");
        String s1 = (words1.get(0)+words1.get(1));
        assert s1.equals("Hello world!");

        Box<Integer> integerBox = new Box<Integer>();
        Integer integerElement =new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();

        Integer theElement = addAndReturn(integerElement,integerList);
     }

     public static <T> T addAndReturn(T element, Collection<T>collection){
        collection.add(element);
        return element;
     }

}
