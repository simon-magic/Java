package Polymorphic.Demo1;

public class Test {
    public static void main(String[] args) {
        // 1. 多态的形式：父类类型 对象名称 = new 子类构造器
        Animal a1 = new Dog();
        a1.run();

        Animal a2 = new Tortoise();
        a2.run();

        // 2. 多态成员访问特点：
        /**
         * 方法调用：编译看左边，运行看右边；
         * 变量调用：编译看左边，运行也看左边。
         */
        a1.run();   // 狗跑得快
        a2.run();   // 乌龟跑得慢

        System.out.println(a1.name);    // 动物
        System.out.println(a2.name);    // 动物

    }
}
