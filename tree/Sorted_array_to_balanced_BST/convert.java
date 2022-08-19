package Sorted_array_to_balanced_BST;
class Node{
    public int data ; 
    public Node right ; 
    public Node left ; 

    public Node(int data){
        this.data = data ; 
        this.right = null ; 
        this.left = null ; 
    }
    public int getData(){ return this.data ;} 
    public void setData(int data){ this.data = data;} 

    public Node getLeft(){ return this.left;}
    public Node getRight(){ return this.right;} 

    public void setLeft(Node left){ this.left = left;} 
    public void setRight(Node right){ this.right = right;} 
}

class BinaryTree{
    void printInorder(Node node){
        if(node == null){
            return ; 
        }
        printInorder(node.left);
        System.out.print(node.data+" ") ; 
        printInorder(node.right); 
    }

    void printPreorder(Node node){
        if(node == null){
            return ; 
        }
        System.out.print(node.data + " ") ; 
        printPreorder(node.left);
        printPreorder(node.right);
    }
    Node SortedArrayToBST(int arr[], int start, int end){
        if(start > end){
            return null ; 
        }
        int mid = (start+end)/2 ; 
        Node root = new Node(arr[mid]) ; 
        root.left = SortedArrayToBST(arr, start, mid-1) ; 
        root.right = SortedArrayToBST(arr, mid+1, end) ; 
        return root ; 
    }
}
public class convert {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10} ; 
        int size = arr.length ; 
        BinaryTree tree = new BinaryTree(); 
        Node root = tree.SortedArrayToBST(arr, 0, size-1) ; 

        System.out.println("Inorder traversal of the tree : ") ; 
        tree.printInorder(root);
        System.out.println("\n") ; 

        System.out.println("Preorder traversal of the tree : ") ; 
        tree.printPreorder(root);

        System.out.println("\n") ; 
    }
    
}
