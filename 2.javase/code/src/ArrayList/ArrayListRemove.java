package ArrayList;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        // 1. 方案1
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);

        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores);
            System.out.println(scores.size());
            System.out.println(i);
            System.out.println("-----------------------");
            int score = scores.get(i);
            if (score<80){
                scores.remove(i);
                i --;
            }
        }

        // 2. 方案2
        ArrayList<Integer> scores2 = new ArrayList<>();
        scores2.add(98);
        scores2.add(77);
        scores2.add(66);
        scores2.add(89);
        scores2.add(79);
        scores2.add(50);
        scores2.add(100);

        for (int i = scores2.size()-1; i >= 0; i--) {
            System.out.println(scores2);
            System.out.println(scores2.size());
            System.out.println(i);
            System.out.println("-----------------------");
            int score = scores2.get(i);
            if (score<80){
                scores2.remove(i);
            }
        }
    }
}
