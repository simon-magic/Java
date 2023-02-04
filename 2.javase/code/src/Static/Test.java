package Static;

public class Test {
    // 静态成员
    public static int onlineNumber = 10;
    public static void test(){
        System.out.println("==test==");
    }

    // 实例成员
    private String name;
    public void run(){
        System.out.println(name + "跑得快");
    }

    // 1. 静态方法只能访问静态成员，不能直接访问实例成员
    public static void test1(){
        // 访问静态成员变量
        System.out.println(onlineNumber);
        // 访问静态成员方法
        Test.test();

        // 但是不能直接访问实例成员变量/方法，需要先创建一个对象，然后访问
        Test t = new Test();
        System.out.println(t.name);
    }

    // 2. 实例方法可以访问静态成员，也可以访问实例成员
    public void test2(){
        // 访问静态成员变量
        System.out.println(onlineNumber);
        // 访问静态成员方法
        Test.test();

        // 访问实例成员变量
        System.out.println(name);
        // 访问实例成员方法
        run();
    }

    // 3. 静态方法中不可以出现this关键字
    public static void test3(){
        // System.out.println(this); // this只能代表当前对象，可以放在实例方法中
    }

    public static void main(String[] args) {
        test1();

    }
}
