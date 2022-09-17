package com.problem.dsa;

import java.util.HashSet;

/*
*
* Given a string s, find the length of the longest substring without repeating characters.
 * */
public class LongestSubstring {
    public static void main(String arg[]){
        //String s = "pwwkew";
        String s = "dvdf";
        //String s = "abcabcbb";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> hash = new HashSet<Character>();
        int i = 0;
        int j = 0;
        while(i<s.length() && j<s.length())
        {
            if(hash.contains(s.charAt(j)))
            {
                hash.remove(s.charAt(i));
                i=i+1;
            }
            else
            {
                hash.add(s.charAt(j));
                j=j+1;
                max=Math.max(j-i,max);
            }
        }
        return max;
    }
}
