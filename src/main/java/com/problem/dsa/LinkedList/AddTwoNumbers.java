package com.problem.dsa.LinkedList;

/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit.
* Add the two numbers and return the sum as a linked list.
*
* You may assume the two numbers do not contain any leading zero, except the number 0 itself.
* */

import com.problem.dsa.LinkedList.ListNode;

public class AddTwoNumbers {
    public static void main(String arg[]){
        int n = 1;
        ListNode first = new ListNode(9);
        //first.next = new com.problem.dsa.LinkedList.ListNode(4);
        //first.next.next = new com.problem.dsa.LinkedList.ListNode(3);

        ListNode second = new ListNode(1);
        second.next = new ListNode(9);
        second.next.next = new ListNode(9);
        second.next.next.next = new ListNode(9);
        second.next.next.next.next = new ListNode(9);
        second.next.next.next.next.next = new ListNode(9);
        second.next.next.next.next.next.next = new ListNode(9);
        second.next.next.next.next.next.next.next = new ListNode(9);
        second.next.next.next.next.next.next.next.next = new ListNode(9);
        second.next.next.next.next.next.next.next.next.next = new ListNode(9);


        ListNode result = addTwoNumbers(first, second);
        display(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = getNodeArray(l1);
        String num2 = getNodeArray(l2);

        String res = add(num1,num2);

        ListNode resultNode = new ListNode();
        ListNode node = new ListNode();
        for(int i=res.length()-1; i>=0; i--){
            if(i==res.length()-1)
            {
                resultNode = new ListNode(res.charAt(i)-'0');
                node = resultNode;
            }
            else{
                resultNode.next = new ListNode(res.charAt(i)-'0');
                resultNode = resultNode.next;
            }
        }
        return node;
    }

    private static String getNodeArray(ListNode l1) {
        int[] numArr = new int[length(l1)];
        String num = "";
        for(int i = 0; i< numArr.length; i++) {
            numArr[i] = l1.val;
            l1 = l1.next;
            num = numArr[i] + num;
        }
        return num;
    }

    private static int length(ListNode node){
        int len =0;
        while (node != null){
            node = node.next;
            len = len+1;
        }
        return len;
    }

    public static String add(String a, String b) {
        int carry = 0;
        String result = "";

        int longestString = Math.max(a.length(), b.length());

        a = String.format("%1$" + longestString + "s", a).replace(' ', '0');
        b = String.format("%1$" + longestString + "s", b).replace(' ', '0');


        for (int i = a.length() - 1; i >= 0; i--) {
            int digitA = a.charAt(i) - 48;
            int digitB = b.charAt(i) - 48;

            int resultingNumber = digitA + digitB + carry;
            if (resultingNumber >= 10) {
                result = (resultingNumber % 10) + result;
                carry = 1;
            } else {
                result = resultingNumber + result;
                carry = 0;
            }
        }
        if (carry > 0) {
            result = carry + result;
        }
        return result;
    }

    private static void display(ListNode result) {
        while(result != null) {
            //Prints each node by incrementing pointer
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
