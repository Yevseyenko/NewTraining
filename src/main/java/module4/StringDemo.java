package module4;

public class StringDemo {
    public static void main(String[] args) {
        String cat1 = "Cat";
        String cat2 = new String ("Cat");
        String newString = String.valueOf(cat1.charAt(0))+String.valueOf(cat2.charAt(1))+String.valueOf(cat1.charAt(2));
        System.out.println(newString);

        if(newString.endsWith("t")){
            System.out.println("Ura");
        }
        System.out.println(newString.indexOf("t"));
    }
}
