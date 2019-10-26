package module;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.weight = 1;
        this.height = 100;
    }

    @Override
    public void eat() {
        this.weight = this.weight + 2;
    }

    @Override
    public void walk() {
        System.out.println("Cant walk");
    }

    public void catchFish() {
        this.height = 0;
        this.weight = 0;
        fireFish();
    }

    private void fireFish() {
        System.out.println("I'm fired");
    }
}
