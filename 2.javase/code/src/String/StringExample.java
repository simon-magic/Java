package String;

public class StringExample {
    public static void main(String[] args) {
        // 1. length: 字符串长度
        System.out.println("--------------------");
        String name = "我爱你中国";
        System.out.println(name.length());  // 5

        // 2. charAt(int index): 获取某个索引位置的字符
        System.out.println("--------------------");
        System.out.println(name.charAt(1)); // 爱
        System.out.println("--------------------");
        // 遍历字符串中每个字符
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // 3. toCharArray: 把字符串转换为字符数组
        System.out.println("--------------------");
        char[] chars = name.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 4. substring(int beginIndex, end endIndex): 根据索引进行截取，左闭右开
        //    substring(int beginIndex): 从索引处一直截取到末尾
        System.out.println("--------------------");
        String name1 = name.substring(0, 3);
        System.out.println(name1);  // 我爱你
        String name2 = name.substring(3);
        System.out.println(name2);  // 中国

        // 5. replace(charSequence target, sharSequence replacement): 使用新值代替旧值，得到新的字符串
        System.out.println("--------------------");
        String name3 = name.replace("中国", "祖国");
        System.out.println(name3);  // 我爱你祖国

        // 6. contains(charSequence s): 是否包含某字符
        System.out.println("--------------------");
        System.out.println(name.contains("中国"));    // true

        // 7. startsWith(String prefix, int toffset): 判断是否是以某个字符（串）开始的，第二个参数是从哪个索引开始
        System.out.println("--------------------");
        System.out.println(name.startsWith("我爱你")); // true
        System.out.println(name.startsWith("我爱你", 1));  // false

        // 8. split(string regex): 根据规则切割字符串，得到字符串数组返回
        System.out.println("--------------------");
        String name4 = "张三，李四，王五，赵六";
        String[] name5 = name4.split("，");
        for (int i = 0; i < name5.length; i++) {
            System.out.println(name5[i]);
        }



    }
}
