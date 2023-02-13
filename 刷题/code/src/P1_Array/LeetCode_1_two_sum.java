package P1_Array;

import org.junit.Test;

import java.util.Arrays;

public class LeetCode_1_two_sum {
    @Test
    public void test(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++ ){
            for (int j=0; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}
