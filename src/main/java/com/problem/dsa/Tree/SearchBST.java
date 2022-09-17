package com.problem.dsa.Tree;

/*
* You are given the root of a binary search tree (BST) and an integer val.
*
* Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
* If such a node does not exist, return null.
* */
public class SearchBST {
    public static void main(String arg[]){
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);

        TreeNode valid = searchBST(node,5);
        System.out.println(valid);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        if(val > root.val) {
            return searchBST(root.right,val);
        }
        if(val < root.val) {
            return searchBST(root.left,val);
        }
        return root;
    }
}
