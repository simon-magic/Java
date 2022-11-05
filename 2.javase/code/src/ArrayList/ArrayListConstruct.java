package ArrayList;

import java.util.ArrayList;

public class ArrayListConstruct {
    public static void main(String[] args) {
        // 1. 创建ArrayList
        ArrayList list = new ArrayList();

        // 2. 添加数据
        list.add("Java");
        list.add(23);
        list.add(10.2);
        list.add(false);

        // 3. 打印查看
        System.out.println(list);   // [Java, 23, 10.2, false]
    }
}
