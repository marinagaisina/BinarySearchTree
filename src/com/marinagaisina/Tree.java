package com.marinagaisina;

public class Tree {
    private TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public Tree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public void insert(int value) {
        if (root == null) {
            this.root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }
    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }
}
