package Polymorphic.Demo2;

public class Dog2 extends Animal2 {
    public String name = "狗";
    @Override
    public void run() {
        System.out.println("狗跑得快");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
