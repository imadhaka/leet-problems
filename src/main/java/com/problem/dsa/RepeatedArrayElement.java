package com.problem.dsa;

import java.util.HashSet;

/*
You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.
 */
public class RepeatedArrayElement {
    public static void main(String args[]) {
        int[] nums = {2,1,2,5,3,2};
        int repeat = repeatedNTimes(nums);
        System.out.println(repeat);
    }

    public static int repeatedNTimes(int[] nums) {
        int repeat = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i:nums){
            if(hashSet.contains(i)){
                repeat = i;
            }
            hashSet.add(i);
        }
        return repeat;
    }
}
