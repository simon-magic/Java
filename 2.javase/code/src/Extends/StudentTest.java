package Extends;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.run();

        // 继承设计思想
        s.setName("Tom");
        s.setAge(10);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.queryCourse();
        s.writeInfo();
    }
}
