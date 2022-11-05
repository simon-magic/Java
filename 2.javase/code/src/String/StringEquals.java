package String;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        // 1. 正确登录名和密码
        String okName = "simon";
        String okPassword = "123456";

        // 2. 用户输入登录名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称：");
        String name = sc.next();
        System.out.println("登陆密码：");
        String password = sc.next();

        // 3. 判断用户登录名称密码是否和正确登录名密码相等
        // 此种写法错误：字符串内容比较不适合用“==”比较。
//        if (okName == name && okPassword == password){
//            System.out.println("登陆成功！");
//        }else {
//            System.out.println("登入失败！");
//        }
        if (okName.equals(name) && okPassword.equals(password)){
            System.out.println("登陆成功！");
        }else {
            System.out.println("登入失败！");
        }

        // 4. 验证码：忽略大小写
        String sysCode = "aBc1";
        System.out.println("验证码：");
        String code1 = sc.next();
        System.out.println(sysCode.equalsIgnoreCase(code1));

    }
}
