package String;

import java.util.Scanner;

public class StringUser {
    public static void main(String[] args) {
        // 1. 定义正确的用户名和密码
        String okLoginName = "admin";
        String okPassword = "123456";

        // 2. 定义一个循环，循环3次
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            // 3. 判断是否登录成功
            if (okLoginName.equals(name) && okPassword.equals(password)){
                System.out.println("登陆成功！");
                break;
            }else{
                System.out.println("用户名或者密码错误，还剩" + (2-i) + "次机会！");
            }
        }

    }
}
