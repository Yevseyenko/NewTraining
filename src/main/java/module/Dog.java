package module;

public class Dog extends Animal implements Smartable {

    public Dog(String name) {
        super(name);
        this.height = 100;
        this.weight = 30;
    }

    @Override
    public void eat() {
        weight++;
    }

    @Override
    public void walk() {
        height++;
        weight++;
    }

    @Override
    public void think() {
        System.out.println("Ok, I'm not so smart");
    }
}
