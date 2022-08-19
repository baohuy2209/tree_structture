package insert;
class Node{
    public int data;
    public Node left; 
    public Node right;

    public Node(int data){
        this.data = data ; 
        this.left = this.right = null ; 
    }
}

class BST {
    public Node root ; 
    public BST(){
        this.root = null ;
    }
    public void printInorder(){
        inorder(this.root) ; 
    }

    private void inorder(Node node) {
        if(node == null){
            return ; 
        }

        inorder(node.left);
        System.out.print(node.data+" ") ; 
        inorder(node.right) ; 
    }

    public Node insert(Node node, int data){
        if(node == null){
            return new Node(data) ; 
        }

        if(node.data > data){
            node.left = insert(node.left, data) ; 
        }
        if(node.data < data){
            node.right = insert(node.right, data) ; 
        }

        return node ; 
    }

}
public class insert {
    public static void main(String[] args){
        BST tree = new BST() ; 
        tree.root=tree.insert(tree.root, 10) ;
        
        tree.insert(tree.root, 5) ; 
        tree.insert(tree.root, 1) ;
        tree.insert(tree.root, 7) ; 
        tree.insert(tree.root, 40) ; 
        tree.insert(tree.root, 50) ; 

        System.out.println("Inorder traversal of the tree : ") ; 
        tree.printInorder();

        System.out.println("\n") ; 
    }
}
