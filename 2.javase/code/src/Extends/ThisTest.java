package Extends;

public class ThisTest {
    public static void main(String[] args) {
        This s1 = new This("Tom", "HKU");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        // 如果不填写schoolName，则默认是SZU
        This s2 = new This("Jack");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }

}
