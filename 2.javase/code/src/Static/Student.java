package Static;

public class Student {
    private String name;

    // 静态成员方法
    public static int getMax(int age1, int age2){
        return age1 > age2 ? age1 : age2;
    }

    public void study(){
        System.out.println(name + "在好好学习，天天向上。");
    }

    public static void main(String[] args) {
        // 1. 类名.静态成员方法
        System.out.println(Student.getMax(10, 20));

        // 2. 对象名.实例方法
        Student s = new Student();
        s.name = "Tom";
        s.study();
    }
}
