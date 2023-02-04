package Static;

public class SingleInstance {
    // 使用饿汉单例
    // 1. 必须将构造器私有化
    private SingleInstance(){}

    // 2. 饿汉单例是在获取对象前，已经准备好了一个对象；这个对象只能是一个，所以定义静态成员变量要记住。
    public static SingleInstance instance = new SingleInstance();
}
