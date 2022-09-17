package com.problem.dsa.Tree;

/*
*
* Given a binary tree, find its height.

 */
public class HeightBinaryTree {
    public static void main(String arg[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(3);
        node.right.left.right = new TreeNode(6);
        int height = findHeight(node);
        System.out.println(height);
    }

    public static int findHeight(TreeNode root){
        if(root == null)
            return 0;
        else {
            return Math.max(findHeight(root.left),findHeight(root.right)) + 1;
        }
    }
}
