package com.problem.java;

/*
* Return subset of three largest number from input array
* Input:{34,56,78,99,88,77}
* Output : { 99,88,78}
* */
public class ThreeLargestNumOfArray {
    public static void main(String arg[]){
        int[] input = {34,56,78,99,88,77};
        int[] output = largestArray(input);
        for(int i = 0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }

    public static int[] largestArray(int[] nums)
    {
        int[] res = new int[3];

        res[0] = res[1] = res[2] = nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > res[0])
            {
                res[2] = res[1];
                res[1] = res[0];
                res[0] = nums[i];
            }
            else if(nums[i] > res[1])
            {
                res[2] = res[1];
                res[1] = nums[i];
            }
            else if(nums[i] > res[2])
            {
                res[2] = nums[i];
            }
        }
        return res;
    }
}
