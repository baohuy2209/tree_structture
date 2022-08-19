// C# program to construct BST from given preorder traversal
using System;
 
// A binary tree node
public class Node {
 
    public int data;
    public Node left, right;
 
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
public class Index {
    public int index = 0;
}
 
public class BinaryTree {
 
    public Index index = new Index();
 
    // A recursive function to construct BST from pre[].
    // preIndex is used to keep track of index in pre[].
    public virtual Node constructTreeUtil(int[] pre,
                                          Index preIndex,
                                          int key, int min,
                                          int max, int size)
    {
 
        // Base case
        if (preIndex.index >= size) {
            return null;
        }
 
        Node root = null;
 
        // If current element of pre[] is in range, then
        // only it is part of current subtree
        if (key > min && key < max) {
 
            // Allocate memory for root of this subtree
            // and increment *preIndex
            root = new Node(key);
            preIndex.index = preIndex.index + 1;
 
            if (preIndex.index < size) {
 
                // Construct the subtree under root
                // All nodes which are in range
                // {min .. key} will go in left
                // subtree, and first such node will
                // be root of left subtree.
                root.left = constructTreeUtil(
                    pre, preIndex, pre[preIndex.index], min,
                    key, size);
            }
            if (preIndex.index < size) {
                // All nodes which are in range
                // {key..max} will go in right
                // subtree, and first such node
                // will be root of right subtree.
                root.right = constructTreeUtil(
                    pre, preIndex, pre[preIndex.index], key,
                    max, size);
            }
        }
 
        return root;
    }
 
    // The main function to construct BST from given
    // preorder traversal. This function mainly uses
    // constructTreeUtil()
    public virtual Node constructTree(int[] pre, int size)
    {
 
        return constructTreeUtil(pre, index, pre[0],
                                 int.MinValue, int.MaxValue,
                                 size);
    }
 
    // A utility function to print inorder traversal of a
    // Binary Tree
    public virtual void printInorder(Node node)
    {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        Console.Write(node.data + " ");
        printInorder(node.right);
    }
 
    // Driver code
    public static void Main(string[] args)
    {
        BinaryTree tree = new BinaryTree();
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        int size = pre.Length;
 
        // Function call
        Node root = tree.constructTree(pre, size);
        Console.WriteLine(
            "Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }
}