package module;

public abstract class Animal {
    protected int weight;
    protected int height;
    private String name;

    public Animal(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public Animal(String name) {
        this(10, 10, name);
    }

    public abstract void eat();

    public abstract void walk();

    public void talk() {
        System.out.println("My name is " + this.name + " weight " + this.weight + " height " + this.height);
    }
}
