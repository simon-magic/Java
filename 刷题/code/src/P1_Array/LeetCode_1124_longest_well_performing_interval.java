package P1_Array;

import org.junit.Test;

/*
### 题目：表现良好的最长时间段
给你一份工作时间表 hours，上面记录着某一位员工每天的工作小时数。
我们认为当员工一天中的工作小时数大于 8 小时的时候，那么这一天就是「劳累的一天」。
所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 大于「不劳累的天数」。
请你返回「表现良好时间段」的最大长度。
示例 1：
输入：hours = [9,9,6,0,6,6,9]
输出：3
解释：最长的表现良好时间段是 [9,9,6]。
示例 2：
输入：hours = [6,6,6]
输出：0
提示：
1 <= hours.length <= 104
0 <= hours[i] <= 16
 */
public class LeetCode_1124_longest_well_performing_interval {
    @Test
    public void test(){
        int[] hours = new int[]{9,6,6};
        System.out.println(longestWPI(hours));
    }

    public int longestWPI(int[] hours) {
        // 1. 计算hours大于8和小于8的数量
        int[] map = new int[]{0, 0};
        for (int i = 0; i < hours.length; i++) {
            map[hours[i]>8 ? 0 : 1]++;
        }

        // 2. 双指针，j --> 左指针，i --> 右指针
        int retLength = 0;
        for (int i = hours.length -1; i >= 0; i--) {
            int[] map1 = new int[2];
            System.arraycopy(map, 0, map1, 0, map.length);
            for (int k = hours.length -1; k > i; k--) {
                map1[hours[k]>8 ? 0 : 1]--;
            }
            int j = 0;
            while (j<=i && map1[0] <= map1[1]){
                map1[hours[j++]>8 ? 0 : 1]--;
            }
            retLength = Math.max(retLength, i + 1 -j);
        }

        return retLength;

    }

}
