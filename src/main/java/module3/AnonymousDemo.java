package module3;

public class AnonymousDemo {
    public static void main(String[] args) {
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                System.out.print("Age is "+x);
            }
        };
        oj1.getAge();
    }
}


