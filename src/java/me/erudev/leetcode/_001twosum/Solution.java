package me.erudev.leetcode._001twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * @author pengfei.zhao
 * @date 2021/6/11 14:00
 */
public class Solution {

    public static void main(String[] args) {
        //int[] nums = {2,7,11,15};
        //int target = 9;
        //int[] nums = {3, 2, 4};
        //int target = 6;
        int[] nums = {3, 3};
        int target = 6;
        int[] res = twoSum(nums, target);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (map.containsKey(target - tmp)) {
                return new int[]{map.get(target - tmp), i};
            }
            map.put(tmp, i);
        }
        return null;
    }
}
