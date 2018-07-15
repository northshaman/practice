package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shaman on 04.07.2018.
 */
public class TwoSumm {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int j = 0; j < nums.length; j++) {
            for (int i = j+1; i < nums.length; i++) {
                if (target == nums[j] + nums[i]) {
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 15};
        System.out.print("[");
        Arrays.stream(twoSum(nums, 20)).forEach(el -> System.out.print(el + ","));
        Arrays.stream(twoSumMap(nums, 20)).forEach(el -> System.out.print(el + ","));
        System.out.print("]");
    }
}
