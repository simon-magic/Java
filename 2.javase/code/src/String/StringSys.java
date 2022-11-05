package String;

import java.util.Random;

public class StringSys {
    public static void main(String[] args) {
        // 1. 定义可能出现的字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        // 2. 循环五次，每次随机生成一个索引，提取对应字符连接起来
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            // 随机一个索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;

        }

        // 3. 输出字符串
        System.out.println(code);
    }
}
