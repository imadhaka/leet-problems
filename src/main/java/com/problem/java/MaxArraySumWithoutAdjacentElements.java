package com.problem.java;

/*
* Super Mario likes to break bricks and collect coins. However, in a series of bricks,
* if he breaks a brick, the bricks adjacent to it becomes poisonous and it kill him if he touches that.
*
* Each brick has one or more coin. Given a series of bricks, with number of coins in them,
* find out the maximum number of coins Super Mario can collect without dying.
*
* For Example:
* Bricks = [1, 2, 3, 1]
* Output = 4
* Explanation = Break the first brick (coin = 1), brick 2 becomes poisonous, so break the 3rd brick (coin = 3). Total 1 + 3 = 4
*
* Example 2:
* Bricks = [1, 2, 1, 2]
* Explanation = Break the second brick (coin = 2), brick 1 and 3 becomes poisonous, so break the 4th brick (coin = 2). Total 2 + 2 = 4
* Output = 4
* */

public class MaxArraySumWithoutAdjacentElements {
    public static void main(String arg[]){
        int[] bricks = {13,6,3,5};

        int sum;
        sum = getMaxSum(bricks);
        System.out.println(sum);
    }

    public static int getMaxSum(int[] bricks){
        int len = bricks.length;
        int[][] ad = new int[len][2];

        if(len == 1){
            return bricks[0];
        }

        ad[0][0] =0;
        ad[0][1] = bricks[0];


        for(int i=1; i<bricks.length; i++){
            ad[i][1] = ad[i-1][0] + bricks[i];
            ad[i][0] = Math.max(ad[i-1][1],ad[i-1][0]);

        }
        return Math.max(ad[len-1][0], ad[len -1][1]);
    }
}
