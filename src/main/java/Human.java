public class Human {

    public  String name ;
    public Human(){
        System.out.println("Hi from constructor without params");
    }

    public Human(String name){
        this.name = name;
    }
    protected  void eat(){
        System.out.println();
    }
}
