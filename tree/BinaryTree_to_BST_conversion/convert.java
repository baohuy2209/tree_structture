package BinaryTree_to_BST_conversion;

import java.util.* ; 

class Node{
    public int data ; 
    public Node right ; 
    public Node left ; 

    public Node(int data) {
        this.data = data ; 
        this.right = null ; 
        this.left = null; 
    }
    public Node() {}

    public int getData(){ return this.data ;}
    public void setData(int data) { this.data = data ;}

    public Node getRight() { return this.right; }
    public void setRight(Node n){ this.right = n ;} 

    public Node getLeft() { return this.left ;}
    public void setLeft(Node n) {this.right = n;}

}
class Index {
    public int index = 0 ; 
}
class BinaryTree{
    Index preindex = new Index() ;
    
    void printPreorder(Node node){
        if(node == null){
            return ; 
        }

        System.out.print(node.data+" ") ; 
        printInorder(node.left);
        printInorder(node.right); 
    }

    void printInorder(Node node){
        if(node == null){
            return ; 
        }

        printInorder(node.left) ; 
        System.out.print(node.data+" ") ; 
        printInorder(node.right) ; 
    }

    int countNodes(Node node){
        if(node == null){
            return 0 ; 
        }

        return countNodes(node.left) + countNodes(node.right) + 1 ;
    }

    void storeInorder(Node node, int arr[], Index preIndex){
        if(node == null){
            return ; 
        }

        storeInorder(node.left, arr, preIndex);
        arr[preIndex.index] = node.data ;
        preIndex.index = preIndex.index + 1 ;  
        storeInorder(node.right, arr, preIndex);
    }

    void arrayToBST(Node node, int arr[], Index preIndex){
        if(node == null){
            return ; 
        }

        arrayToBST(node.left, arr, preIndex);
        node.data = arr[preIndex.index] ; 
        preIndex.index = preIndex.index + 1 ; 
        arrayToBST(node.right, arr, preIndex);
    }

    void binaryTreeToBST(Node node){
        if(node == null){
            return ; 
        }
        int n = countNodes(node) ; 
        int arr [] = new int[n] ; 

        storeInorder(node, arr, preindex);

        Arrays.sort(arr) ; 

        preindex.index = 0 ; 
        arrayToBST(node, arr, preindex);
    }


}
public class convert {
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree() ; 

        Node root = new Node(10) ; 
        root.left = new Node(15) ; 
        root.right = new Node(20) ; 
        root.left.right = new Node(5) ; 
        root.left.left = new Node(7) ; 
        root.right.left = new Node(40) ; 
        root.right.right = new Node(50) ; 
        
        tree.binaryTreeToBST(root);

        System.out.println("Inorder traversal of the constructed tree : ") ; 
        tree.printInorder(root); 

        System.out.println("\n") ; 
    }
}
