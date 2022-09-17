package com.problem.dsa.Tree;

/**
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */

class BalancedBinaryTree {
    public static void main(String arg[]){
        TreeNode root = new TreeNode(1);
        //root.left = new com.problem.dsa.Tree.TreeNode(9);
        root.right = new TreeNode(2);
        //root.right.left = new com.problem.dsa.Tree.TreeNode(15);
        root.right.right = new TreeNode(3);

        System.out.println(isBalanced(root));

    }

    private static int height(TreeNode node){
        if(node == null)
        {
            return 0;
        }
        return Math.max(height(node.left),height(node.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }
}
