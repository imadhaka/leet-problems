package com.problem.dsa.Tree;

/*
* Given the roots of two binary trees p and q, write a function to check if they are the same or not.
*
* Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
* */
public class SameTree {
    public static void main(String arg[]){
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(6);

        TreeNode node2 = new TreeNode(5);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(6);

        Boolean valid = isSameTree(node,node2);
        System.out.println(valid);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if(p==null || q==null || p.val != q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
