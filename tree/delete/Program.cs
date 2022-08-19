using System ; 
namespace tree.delete{
    class Node{
        public int data ; 
        public Node left ; 
        public Node right ; 

        public Node(int data){
            this.data = data ; 
            this.left = null; 
            this.right = null ; 
        }
        public Node(){}

        public int getData() {return this.data ;}
        public void setData(int n) {this.data = n ;}

        public Node getRight() {return this.right ;}
        public Node getLeft() {return this.left ;}

        public void setRight(Node n) {this.right = n ;}
        public void setLeft(Node n) {this.left = n ;}
    }

    class BST{
        public Node root ; 
        public BST(){
            this.root = null ; 
        }

        public void printInorder(){
            inorder(this.root) ; 
        }
        private void inorder(Node node){
            if(node != null){
                inorder(node.left) ; 
                Console.Write(node.data+" ") ; 
                inorder(node.right) ; 
            }
        }

        public void insert(int data){
            this.root = insertRec(this.root, data) ; 
        }
        private Node insertRec(Node node, int data){
            if(node == null){
                return new Node(data) ; 
            }

            if(node.data < data){
                node.right = insertRec(node.right, data) ; 
            }

            if(node.data > data){
                node.left = insertRec(node.left, data) ; 
            }

            return node ; 
        }

        private int minvalue(Node node){
            int minv = node.data;
            while (node.left != null) {
                minv = node.left.data;
                node = node.left;
            }
            return minv;
        }

        public void deleteKey(int data){
            this.root = deleteRec(this.root, data);
        }
        private Node deleteRec(Node node, int data){
            if(node == null){
                return node ; 
            }

            if(node.data > data){
                node.left = deleteRec(node.left,data) ; 
            }else if(node.data < data){
                node.right = deleteRec(node.right, data) ; 
            }else{
                if(node.right == null){
                    return node.left ; 
                }else if(node.left == null){
                    return node.right ; 
                }

                node.data = minvalue(node.right) ; 

                node.right = deleteRec(node.right, node.data) ; 
            }
            return node ; 
        }
    }

    public class Del_program{
        public static void Main(String[] args){
            BST tree = new BST();
  
        /* Let us create following BST
            50
        / \
        30 70
        / \ / \
        20 40 60 80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
  
        Console.WriteLine(
            "Inorder traversal of the given tree");
        tree.printInorder();
  
        Console.WriteLine("\nDelete 20");
        tree.deleteKey(20);
        Console.WriteLine(
            "Inorder traversal of the modified tree");
        tree.printInorder();
  
        Console.WriteLine("\nDelete 30");
        tree.deleteKey(30);
        Console.WriteLine(
            "Inorder traversal of the modified tree");
        tree.printInorder();
  
        Console.WriteLine("\nDelete 50");
        tree.deleteKey(50);
        Console.WriteLine(
            "Inorder traversal of the modified tree");
        tree.printInorder();
        }
    }
}