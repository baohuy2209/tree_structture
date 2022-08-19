package BST_to_Tree_with_sum_of_all_smaller_keys;
class Node {
  
    int data;
    Node left, right;
  
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
  
class Sum {
  
    int addvalue = 0;
}
  
public class convert {
    static Node root;
    Sum add = new Sum();
  
    // A recursive function that traverses 
    // the given BST in inorder and for every 
    // key, adds all smaller keys to it
    void addSmallerUtil(Node node, Sum sum)
    {
  
        // Base Case
        if (node == null) {
            return;
        }
  
        // Recur for left subtree first so that
        //  sum of all smaller Nodes is stored at sum
        addSmallerUtil(node.left, sum);
  
        // Update the value at sum
        sum.addvalue = sum.addvalue + node.data;
  
        // Update key of this Node
        node.data = sum.addvalue;
  
        // Recur for right subtree so that the 
        // updated sum is added to greater Nodes
        addSmallerUtil(node.right, sum);
    }
  
    // A wrapper over addSmallerUtil().  It 
    // initializes addvalue and calls
    // addSmallerUtil() to recursively update 
    // and use value of addvalue
    Node addSmaller(Node node)
    {
        addSmallerUtil(node, add);
        return node;
    }
  
    // A utility function to print inorder
    // traversal of Binary Tree
    void printInorder(Node node)
    {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public static void main(String[] args)
    {
        convert tree = new convert();
        tree.root = new Node(9);
        tree.root.left = new Node(6);
        tree.root.right = new Node(15);
  
        System.out.println("Original BST");
        tree.printInorder(root);
        Node Node = tree.addSmaller(root);
        System.out.println("");
        System.out.println("BST To Binary Tree");
        tree.printInorder(Node);
    }
}
