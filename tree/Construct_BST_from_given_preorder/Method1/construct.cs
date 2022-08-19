using System ; 
namespace Construct_BST_from_given_preorder.Method1{
    class Node {
        public int data;
        public Node left ; 
        public Node right ; 

        public Node(int data){
            this.data = data ; 
            this.left = null ; 
            this.right = null ; 
        }

        public int getData() {return this.data ;}
        public void setData(int item) {this.data = item ;}

        public Node getLeft() {return this.left ;}
        public Node getRight() {return this.right ;}

        public void setLeft(Node left) {this.left = left ;} 
        public void setRight(Node right) {this.right = right ;} 

        public int key {
            get {return data;}
            set {data = value;}
        }
        public Node l {
            get {return left;}
            set {left = value;}
        }
        public Node r {
            get {return right;}
            set {right = value;}
        }
    }
    class Index {
        public int index = 0 ; 
    }
    class BinaryTree {
        public Index index = new Index() ; 
        public void printInorder(Node node){
            if(node == null) {
                return ; 
            }

            printInorder(node.left) ; 
            Console.Write(node.data+" ") ; 
            printInorder(node.right) ;
        }

        public Node constructTreeUtil(int []pre, Index preIndex, int low, int high, int size){
            if (preIndex.index > size || low > high){
                return null ; 
            }

            Node root = new Node(pre[preIndex.index]) ; 
            preIndex.index = preIndex.index + 1 ; 

            if (low == high) {
                return root ; 
            }

            int i ; 
            for (i = low; i <= high; i++){
                if(root.data < pre[i]){
                    break ; 
                }
            }

            root.left = constructTreeUtil(pre, preIndex, preIndex.index, i-1 ,size) ;
            root.right = constructTreeUtil(pre, preIndex, i, high, size) ; 

            return root ;  
        }

        public Node constructTree(int []pre, int size){
            return constructTreeUtil(pre, index, 0, size-1, size) ;            
        }
    }

    public class Construct {
        public static void Main(string[] args){
            int [] pre = new int[] {10, 5, 1, 7, 40, 25, 50} ; 
            int size = pre.Length ; 

            BinaryTree tree = new BinaryTree(); 
            Node root = tree.constructTree(pre, size) ; 

            Console.WriteLine("In_order traversal of the constructed tree : ") ; 
            tree.printInorder(root) ; 

            Console.WriteLine("\n") ; 
        }
    }
}