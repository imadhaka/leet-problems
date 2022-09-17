package com.problem.dsa;

/*
*
* Push all the zeroes of array at the end
* without changing the sequence
*
* */
public class PushZeroToEnd {
    public static void main(String arg[]){
        int[] arr = {0, 1, 0, 3, 1, 4, 0, 6, 7};
        int[] result = pushToEnd(arr);
        for (int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }
    }

    static int[] pushToEnd(int[] arr){
        int len = arr.length;
        int cnt = 0;
        for(int i = 0; i < len; i++)
        {
            if(arr[i] != 0){
                arr[cnt] = arr[i];
                cnt++;
            }
        }
        while (cnt < len)
        {
            arr[cnt++] = 0;
        }
        return arr;
    }
}
