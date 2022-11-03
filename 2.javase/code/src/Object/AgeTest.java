package Object;

public class AgeTest {
    public static void main(String[] args) {
        Age a = new Age();
        a.setAge(30);
        int age = a.getAge();
        System.out.println("年龄是：" + age);
    }
}
