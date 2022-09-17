package com.problem.dsa.Tree;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */

public class ValidBST {
    public static void main(String arg[]){
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(6);
        //node.right.left = new com.problem.dsa.Tree.TreeNode(3);
        //node.right.right = new com.problem.dsa.Tree.TreeNode(6);
        Boolean valid = isValidBST(node);
        System.out.println(valid);
    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return (isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE));
    }

    private static boolean isValidBST(TreeNode root, long min, long max){
        if(root == null)
        {
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return isValidBST(root.left,min,root.val) && isValidBST(root.right, root.val, max);
    }
}
