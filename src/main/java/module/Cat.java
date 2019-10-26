package module;

class Cat extends Animal implements Smartable {
    private String favouriteFood = "Wiskas";

    public Cat(int weight, int height, String name, String favouriteFood) {

        super(weight, height, name);
        this.favouriteFood = favouriteFood;
    }


    @Override
    public void eat() {
        this.weight++;
        this.height++;
    }

    @Override
    public void walk() {
        this.weight--;
    }

    public void walk(String s){
        System.out.println(s);
    }

    @Override
    public void think() {
        System.out.println("I'm smart cat, but dog is stupid");
    }
}
