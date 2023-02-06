package Interface;

/**
 * 申明一个接口：体现一种规范，规范一定是公开的。
 */
public interface InterfaceDemo {
    // JDK8之前的接口中只能有抽象方法和常量
    // 1. 常量
    public static final String SCHOOL_NAME = "SZU";

    // 2. 抽象方法
    // 注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstract可以省略不写。
    public abstract void run();
    public abstract void eat();

}
