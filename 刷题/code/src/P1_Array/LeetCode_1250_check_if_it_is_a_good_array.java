package P1_Array;

import org.junit.Test;

/*
## 题目：检查「好数组」
给你一个正整数数组 nums，你需要从中任选一些子集，然后将子集中每一个数乘以一个 任意整数，并求出他们的和。
假如该和结果为 1，那么原数组就是一个「好数组」，则返回 True；否则请返回 False。
示例 1：
输入：nums = [12,5,7,23]
输出：true
解释：挑选数字 5 和 7。
5*3 + 7*(-2) = 1
示例 2：
输入：nums = [29,6,10]
输出：true
解释：挑选数字 29, 6 和 10。
29*1 + 6*(-3) + 10*(-1) = 1
示例 3：
输入：nums = [3,6]
输出：false
提示：
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9

思路：
裴蜀定理：
对于不全为零的任意整数 a 和 b，记 g=gcd(a,b)，其中 gcd(a,b)为 a 和 b 的最大公约数，则对于任意整数 x 和 y 都满足 a×x+b×y 是 g 的倍数，特别地，存在整数 x 和 y 满足 a×x+b×y=g。
所以这道题就相当于是求一个数组中是否存在若干个正数是否最大公约数为1，若存在就是好数组，不存在则是坏数组。
 */
public class LeetCode_1250_check_if_it_is_a_good_array {
    @Test
    public void test(){
        int[] nums = new int[]{12,5,7,23};
        System.out.println(isGoodArray(nums));
    }

    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        if (gcd == 1){
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            gcd = gcdMethod(gcd, nums[i]);
            if (gcd==1){
                return true;
            }
        }
        return false;
    }

    public int gcdMethod(int a, int b){
        if (b == 0){
            return a;
        }
        return gcdMethod(b, a%b);
    }
}
