package Static;

import java.util.Random;

public class Util {
    // 注意：由于工具类无需创建对象，所以把其构造器私有化
    private Util(){
    }

    // 静态方法：生成N位验证码
    public static String createVerifyCode(int n) {
        // 1. 定义可能出现的字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 2. 循环五次，每次随机生成一个索引，提取对应字符连接起来
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 随机一个索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;

        }

        // 3. 输出字符串
        System.out.println(code);

        // 4. 返回字符串
        return code;
    }

}
