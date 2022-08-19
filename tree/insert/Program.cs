using System ; 
namespace tree.insert{
        class Node{
        public int data ; 
        public Node right, left ; 

        public Node(int data){
            this.data = data; 
            this.right = null ; 
            this.left = null ; 
        }
    }

    class BST{
        public Node root ; 
        public BST(){ root = null;}
        public BST(int value){
            this.root.data = value ; 
        }

        public void insert(int item){
            this.root = insertRec(this.root,item);
        }
        private Node insertRec(Node node, int item){
            if(node == null){
                Node tmp = new Node(item) ; 
                node = tmp ; 
                return node ; 
            }

            if(node.data > item){
                node.left = insertRec(node.left, item) ; 
            }

            if(node.data < item){
                node.right = insertRec(node.right, item) ; 
            }

            return node ; 
        }

        public void printInorder(){
            inorder(this.root) ; 
        }
        private void inorder(Node node){
            if(node == null){
                return ; 
            }
            inorder(node.left);
            Console.Write(node.data+" ") ; 
            inorder(node.right) ; 
        }
    }

    public class Program{
        public static void Main(String[] args) {
            BST tree = new BST(); 
            tree.insert(10) ; 
            tree.insert(5) ; 
            tree.insert(1) ; 
            tree.insert(7) ; 
            tree.insert(40) ; 
            tree.insert(50) ; 

            Console.Write("Inorder traversal of the tree : ") ; 
            tree.printInorder() ; 
        }
    }
}