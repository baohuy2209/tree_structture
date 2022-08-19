using System ; 
using System.Collections.Generic ; 

namespace Tree.Construct_BST_from_given_preorder_using_Stack{
    class Node{
        public int data;
        public Node left, right;
 
        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    class BinaryTree
    {
        public virtual Node constructTree(int [] pre, int size){
            Node root = new Node(pre[0]) ; 

            Stack<Node> s = new Stack<Node>(); 
            s.Push(root);

            for(int i = 1 ; i< size ; i++){
                Node temp = null ; 

                while(s.Count > 0 && s.Peek().data < pre[i]){
                    temp = s.Pop();
                }
                if(temp != null){
                    temp.right = new Node(pre[i]) ; 
                    s.Push(temp.right) ; 
                }else{
                    temp = s.Peek() ; 
                    temp.left = new Node(pre[i]); 
                    s.Push(temp.left) ; 
                }
            }
            return root ; 
        }
        public virtual void printInorder(Node node)
        {
            if (node == null)
            {
                return;
            }
            printInorder(node.left);
            Console.Write(node.data + " ");
            printInorder(node.right);
        }
 
    // Driver program to test above functions
        public static void Main(string[] args)
        {
            BinaryTree tree = new BinaryTree();
            int[] pre = new int[]{10, 5, 1, 7, 40, 50};
            int size = pre.Length;
            Node root = tree.constructTree(pre, size);
            Console.WriteLine("Inorder traversal of the constructed tree is ");
            tree.printInorder(root);
        }
    }
}