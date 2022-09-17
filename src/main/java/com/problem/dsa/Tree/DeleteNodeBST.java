package com.problem.dsa.Tree;

/*
* Given a root node reference of a BST and a key, delete the node with the given key in the BST.
* Return the root node reference (possibly updated) of the BST.
*
* Basically, the deletion can be divided into two stages:
* Search for a node to remove.
* If the node is found, delete the node.
*
* */

public class DeleteNodeBST {
    public static void main(String arg[]){
        TreeNode node = new TreeNode(0);
        /*node.left = new TreeNode(3);
        node.right = new TreeNode(6);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode();
        node.right.right = new TreeNode(4);*/

        TreeNode valid = deleteNode(node,0);
        System.out.println(valid);
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
            if(root == null)
            {
                return root;
            }
            if(key > root.val){
                root.right = deleteNode(root.right,key);
            }
            if(key < root.val){
                root.left = deleteNode(root.left,key);
            }
            if(key == root.val){
                if((root.left == null && root.right == null)){
                    root = null;
                }
                else if (root.right != null){
                    // the node is not a leaf and has a right child
                    root.val = successor(root);
                    root.right = deleteNode(root.right, root.val);
                } else {
                    // the node is not a leaf, has no right child, and has left child
                    root.val = predecessor(root);
                    root.left = deleteNode(root.left, root.val);
                }
            }
        return root;
    }

    public static int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    public static int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }

}
