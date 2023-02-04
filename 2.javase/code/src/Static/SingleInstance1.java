package Static;

public class SingleInstance1 {
    // 使用懒汉单例
    // 1. 必须将构造器私有化
    private SingleInstance1(){}

    // 2. 定义一个静态的成员变量，存储一个对象，只加载一次，只有一份。
    private static SingleInstance1 instance;

    // 3. 提供一个方法，对外返回单例对象。
    public static SingleInstance1 getInstance(){
        if (instance==null){
            instance = new SingleInstance1();
        }
        return instance;
    }
}
