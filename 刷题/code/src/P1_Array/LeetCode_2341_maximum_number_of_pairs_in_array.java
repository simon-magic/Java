package P1_Array;

import org.junit.Test;

import java.util.Arrays;

/*
## 题目：数组能形成多少数对
给你一个下标从 0 开始的整数数组 nums 。在一步操作中，你可以执行以下步骤：
从 nums 选出 两个 相等的 整数
从 nums 中移除这两个整数，形成一个 数对
请你在 nums 上多次执行此操作直到无法继续执行。
返回一个下标从 0 开始、长度为 2 的整数数组 answer 作为答案，其中 answer[0] 是形成的数对数目，answer[1] 是对 nums 尽可能执行上述操作后剩下的整数数目。
示例 1：
输入：nums = [1,3,2,1,3,2,2]
输出：[3,1]
解释：
nums[0] 和 nums[3] 形成一个数对，并从 nums 中移除，nums = [3,2,3,2,2] 。
nums[0] 和 nums[2] 形成一个数对，并从 nums 中移除，nums = [2,2,2] 。
nums[0] 和 nums[1] 形成一个数对，并从 nums 中移除，nums = [2] 。
无法形成更多数对。总共形成 3 个数对，nums 中剩下 1 个数字。
示例 2：
输入：nums = [1,1]
输出：[1,0]
解释：nums[0] 和 nums[1] 形成一个数对，并从 nums 中移除，nums = [] 。
无法形成更多数对。总共形成 1 个数对，nums 中剩下 0 个数字。
示例 3：
输入：nums = [0]
输出：[0,1]
解释：无法形成数对，nums 中剩下 1 个数字。
提示：
1 <= nums.length <= 100
0 <= nums[i] <= 100
 */
public class LeetCode_2341_maximum_number_of_pairs_in_array {
    @Test
    public void test(){
        int[] nums = new int[]{66,73,100,14,42};
        System.out.println(Arrays.toString(numberOfPairs(nums)));

    }

    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        int[] retInt = new int[]{0, 0};
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            retInt[0] += cnt[i] / 2;
            retInt[1] += cnt[i] % 2;
        }
        return retInt;
    }
}
