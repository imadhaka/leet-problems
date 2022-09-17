package com.problem.dsa;

/*
* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
* such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
*
* Notice that the solution set must not contain duplicate triplets.
* */

import java.util.*;

public class ThreeSum {
    public static void main(String arg[]){
        int[] num = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> result = threeSum(num);
        System.out.println(result.get(0));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return triplets;
        }
        Arrays.sort(nums);
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int target = 0 - nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            ArrayList<Integer> list = new ArrayList<Integer>();
            while (start < end) {
                if (nums[start] + nums[end] == target &&
                        !set.contains(nums[i] + "," + nums[start] + "," + nums[end])) {
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    triplets.add(list);
                    set.add(nums[i] + "," + nums[start] + "," + nums[end]);
                    list = new ArrayList<Integer>();
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return triplets;
    }
}
