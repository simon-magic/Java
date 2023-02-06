package Polymorphic.Demo2;

public class Tortoise2 extends Animal2 {
    public String name = "乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }

    public void layEggs(){
        System.out.println("乌龟下单");
    }
}
