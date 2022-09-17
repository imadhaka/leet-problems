package com.problem.dsa.LinkedList;/*
* Given the head of a linked list, remove the nth node from the end of the list and return its head.
* */

import com.problem.dsa.LinkedList.ListNode;

public class RemoveNode {
    public static void main(String arg[]) {
        int n = 1;
        ListNode head = new ListNode(5);
        ListNode head1 = new ListNode(4, head);
        ListNode head2 = new ListNode(3, head1);
        ListNode head3 = new ListNode(2, head2);
        ListNode head4 = new ListNode(1, head3);
        ListNode result = removeNthFromEnd(head, n);
        display(result);
    }

    private static void display(ListNode result) {
        while(result != null) {
            //Prints each node by incrementing pointer
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode node = head;
        while (node != null){
            node = node.next;
            len = len+1;
        }
        if (len-n+1 == 1)
        {
            return head.next;
        }
        node = head;
        for (int i=1; i<(len-n+1); i++)
        {
            if(i == (len-n)){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }
}
