package Static;

public class User {
    public static int onlineNumber = 161;

    private String name;
    private int age;

    public static void main(String[] args) {
        // 理解static修饰成员变量的作用和访问特点
        // 1. 类名.静态成员变量
        System.out.println(User.onlineNumber); // 161

        // 2. 对象名.实例成员变量
        User u = new User();
        u.name = "Tom";
        u.age = 20;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineNumber ++;
        System.out.println(u.onlineNumber); // 162 // 此种方法不推荐
        System.out.println(User.onlineNumber); // 162

        // 注意：同一个类中静态成员变量的访问可以省略类名
        System.out.println(onlineNumber); // 162
    }
}
