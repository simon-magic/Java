package String;

public class InterviewQuestion {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);   // false
        System.out.println("----------------------------");

        String s3 = "abc";
        String s4 = "ab";
        String s5 = s4 + "c";
        System.out.println(s3 == s5);   // false
        System.out.println("----------------------------");

        String s6 = "a" + "b" + "c";
        System.out.println(s3 == s6);   // true. 原因是：java存在编译优化机制，程序在编译时："a" + "b" + "c"会直接转成"abc".

    }
}
