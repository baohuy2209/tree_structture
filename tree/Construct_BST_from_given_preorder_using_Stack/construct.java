package Construct_BST_from_given_preorder_using_Stack;

import java.util.*;

class Node {
    public int data;
    public Node right;
    public Node left;

    public Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class BinaryTree {
    public Node constructTree(int pre[], int size) {
        Node root = new Node(pre[0]);
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        for (int i = 1; i < size; i++) {
            Node temp = null;
            while (!stack.isEmpty() && stack.peek().data < pre[i]) {
                temp = stack.pop();
            }

            if (temp != null) {
                temp.right = new Node(pre[i]);
                stack.push(temp.right);
            } else {
                temp = stack.peek();
                temp.left = new Node(pre[i]);
                stack.push(temp.left);
            }
        }

        return root;
    }

    public void printInorder(Node node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}

public class construct {
    public static void main(String[] agrs) {
        BinaryTree tree = new BinaryTree();
        int arr[] = { 10, 5, 1, 7, 40, 25, 50 };
        Node root = tree.constructTree(arr, arr.length);

        System.out.println("Inorder traversal of the constructed tree : ");
        tree.printInorder(root);

        System.out.println("\n");
    }
}
