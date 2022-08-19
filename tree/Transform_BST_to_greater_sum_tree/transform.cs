using System ; 
namespace tree.Transform_BST_to_greater_sum_tree{
    class Node{
        public int data;
        public Node left ; 
        public Node right ; 
        public Node(int data){
            this.data = data ; 
            this.right = null ; 
            this.left = null ; 
        }

        public int getData() {return this.data ;}
        public void setData(int data) {this.data = data ;}

        public Node getRight() {return this.right ;}
        public Node getLeft() {return this.left ;}

        public void setRight(Node n) {this.right = n ;}
        public void setleft(Node n) {this.left = n ;}

        public int item{
            get {return data;}
            set {data = value;}
        }
        public Node l {
            get {return left;}
            set {left = value;}
        }
        public Node r {
            get {return right;}
            set {right = value ;}
        }
    }
    class Sum{
        public int addvalue ;
    }
    class BinaryTree{
        public Sum sum = new Sum() ; 

        public void printPreorder(Node node){
            if(node == null){
                return ; 
            }
            Console.Write(node.data+ " ") ; 
            printPreorder(node.left)  ; 
            printPreorder(node.right) ;
        }
        public Node insert(Node node, int data){
            if(node == null){
                return new Node(data) ; 
            }
            if(node.data < data){
                node.right = insert(node.right, data) ; 
            }

            if(node.data > data){
                node.left = insert(node.left, data) ; 
            }

            return node ; 
        }

        public void create(Node node, int []arr, int size){
            for(int i = 0 ; i < size ; i++){
                node = insert(node, arr[i]) ; 
            }
        }

        public void TransformTreeUtil(Node node, Sum presum){
            if(node == null){
                return ; 
            }

            TransformTreeUtil(node.right, presum) ; 
            presum.addvalue = presum.addvalue + node.data ; 
            node.data = presum.addvalue - node.data ; 
            TransformTreeUtil(node.left, presum) ; 
        }

        public void transformTree(Node node){
            TransformTreeUtil(node, sum) ; 
        }
    }

    public class transform{
        public static void Main(string[] args) {
            int [] arr = new int [] {5,1,7,40,50} ; 

            Node root = new Node(10) ; 
            BinaryTree tree = new BinaryTree() ; 
            tree.create(root, arr, arr.Length) ; 

            tree.transformTree(root) ; 

            Console.WriteLine("Preorder traversal of the modified tree : ") ; 
            tree.printPreorder(root) ; 
            Console.WriteLine("\n") ; 
        }
    }
}
