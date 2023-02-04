package Static;

import java.util.ArrayList;

public class StaticCodeTest {
    // 1. 定义一个静态的集合，只加载一次
    public static ArrayList<String> cards = new ArrayList<>();

    // 2. 在程序真正运行main方法前，将54张牌放进去
    static {
        // 定义一个数组存放全部点数
        String[] sizes = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // 定义一个数组存放花色
        String[] colors = new String[]{"♥", "♦", "♠", "♣"};
        // 遍历
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                // 形成一张牌
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        // 单独加入大小王
        cards.add("🃏");
        cards.add("🃏");
    }

    public static void main(String[] args) {
        System.out.println("新牌" + cards);
    }
}
