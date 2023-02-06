package Polymorphic.Demo2;


public class Test2 {
    public static void main(String[] args) {
        // 自动类型转换
        Animal2 a1 = new Dog2();
        a1.run();

        // 强制类型转换
        Animal2 a2 = new Tortoise2();
        a2.run();
        Tortoise2 t = (Tortoise2) a2;   // 父类强制转换为子类
        t.layEggs();

        // Dog2 d = (Dog2) a2;  // 此强制类型转换，编译阶段不报错，但是运行时报错。
        // 判断a2是Tortoise2或者Dog2
        if (a2 instanceof Tortoise2){
            Tortoise2 t2 = (Tortoise2) a2;
            t.layEggs();
        }else if(a2 instanceof Dog2){
            Dog2 d = new Dog2();
            d.lookDoor();
        }


    }
}
