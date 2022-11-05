package ArrayList;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Mysql");
        list.add("HTML");
        list.add("CSS");
        list.add("Javascript");

        // 1. public E get(int index): 获取指定索引除的元素
        System.out.println("--------------------");
        String e = list.get(1);
        System.out.println(e);  // "Mysql"

        // 2. public int size(): 获取集合中元素的个数
        System.out.println("--------------------");
        System.out.println(list.size());    // 5

        // 3. 集合的遍历
        System.out.println("--------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 4. public E remove(int index): 删除指定索引处的元素，返回被删的元素
        System.out.println("--------------------");
        System.out.println("被删之前的ArrayList：" + list);   // [Java, Mysql, HTML, CSS, Javascript]
        System.out.println("被删的元素是：" + list.remove(2)); // "HTML"
        System.out.println("被删之后的ArrayList：" + list);   // [Java, Mysql, CSS, Javascript]

        // 5. public boolean remove(Object o): 删除指定元素，返回删除是否成功
        // 注意：若指定元素出现多次，只删除排在第一个的位置
        System.out.println("--------------------");
        System.out.println(list.remove("Java"));    // true
        System.out.println("被删之后的ArrayList：" + list);   // [Mysql, CSS, Javascript]

        // 6. public E set(int index, E element): 修改指定位置的元素，并返回被修改的元素
        System.out.println("--------------------");
        System.out.println(list.set(0, "数据库")); // Mysql
        System.out.println(list);   // [数据库, CSS, Javascript]
    }
}
