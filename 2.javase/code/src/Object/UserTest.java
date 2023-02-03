package Object;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("张三");
        u1.setHeight(180.2);
        u1.setSalary(10000.0);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        User u2 = new User();
        u2.setName("李四");
        u2.setHeight(170.2);
        u2.setSalary(100000.0);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());

    }


}
