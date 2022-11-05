package String;

import java.util.Scanner;

public class StringPhoneNumber {
    public static void main(String[] args) {
        // 1. 输入一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号码：");
        String tel = sc.next();

        // 2. 截取手机号码前三位和后四位
        String before = tel.substring(0, 3);
        String after = tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
