package Static;

public class StaticCode {
    public static String name;
    private int age;

    // 静态代码块：有static修饰，属于类，与类一起优先加载一次，自动触发执行
    // 作用：可以用于初始化静态资源
    static {
        System.out.println("---静态代码块被执行---");   // 它比main方法先执行
        name = "Tom";
        System.out.println(name);
    }

    // 实例代码块（构造代码块）：无static修饰，每次构造对象时，都会触发一次执行。
    // 作用：可以初始化实例资源
    {
        age = 10;
        System.out.println("---实例代码块被执行---");
    }

    public static void main(String[] args) {
        System.out.println("---main方法被执行---");
        System.out.println(name);

        StaticCode s1 = new StaticCode();
        StaticCode s2 = new StaticCode();


    }

}
