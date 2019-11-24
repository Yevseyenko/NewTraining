package module4;

public class StringDemo2 {
    public static void main(String[] args) {
        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = cat3.intern();
        String cat5 = new String("Cat");

//        System.out.println(cat1==cat2);
//        System.out.println(cat1==cat3);
//        System.out.println( cat4==cat3);
//        System.out.println(cat5==cat3);
//        System.out.println(cat5==cat1);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat4));
        StringBuffer sb = new StringBuffer("Privet");
        sb.reverse();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        String m = "I am the best tester at Epam";


        for (int i = 0; i < m.length(); i++) {
            System.out.println(m);
        }

    }
}