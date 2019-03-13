package pers.wyt.leetcode.t1tot50;

/**
 * @Author: wanyutong
 * @Date: 2019/1/8
 * @Description:
 */
public class T1 {
    public int[] twoSum(int[] nums, int target) {
        int[] returnInt = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    returnInt[0] = i;
                    returnInt[1] = j;
                    return returnInt;
                }
            }
        }
        return null;
    }
}
