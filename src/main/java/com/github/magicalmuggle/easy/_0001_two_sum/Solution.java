package com.github.magicalmuggle.easy._0001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/description/
 */
public class Solution {
    /**
     * A function to find the indices of the two numbers that add up to the target.
     *
     * @param nums   an array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
