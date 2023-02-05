package Package;

import Package.it.Student;

public class Test {
    public static void main(String[] args) {
        // 1. 同一个包下的类，互相可以直接访问
        System.out.println(User.onlineNumber);

        // 2. 不同包下的类，必须先导包才可以访问
        Student s1 = new Student();

        // 3. 如果这个类中使用不同包下的相同的类名，此时默认只能导入一个类的包，另外一个包必须使用全名访问
//        Package.it1.Student s2 = new Package.it1.Student();
    }
}
