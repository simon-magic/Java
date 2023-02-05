package Extends;

public class Dog extends Animal{
    public String name = "狗名";

    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void run(){
        System.out.println("狗可以跑");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);           // 局部名
        System.out.println(this.name);      // 狗名
        System.out.println(super.name);     // 动物名

        run();                              // 狗可以跑
        super.run();                        // 动物可以跑


    }
}
