package Construct_BST_from_given_preorder.Method1;

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
    public void setData(int key) { this.data = key ;}

    public Node getRight() { return this.right ;}
    public void setRight(Node right) { this.right = right ;}

    public Node getLeft() { return this.left ;}
    public void setLeft(Node left) { this.left = left ;}
}
class Index {
    int index = 0 ; 
}

class BinaryTree {
    Index index = new Index() ; 

    Node constructTreeUtil(int pre[], Index preIndex, int low, int high, int size){
        if(preIndex.index > size || low > high){
            return null ; 
        }

        Node root = new Node(pre[preIndex.index]) ;
        preIndex.index = preIndex.index + 1 ; 
        
        if(low == high) {
            return root ; 
        }

        int i; 
        for(i = low; i <= high; i++){
            if(root.data < pre[i]){
                break ; 
            }
        }

        root.left = constructTreeUtil(pre, preIndex, preIndex.index, i-1, size) ; 
        root.right = constructTreeUtil(pre, preIndex, i, high, size) ; 

        return root ; 
    }

    Node constructTree(int pre[], int size){
        index.index = 0 ;
        
        return constructTreeUtil(pre, index, 0, size - 1 , size) ; 
    }

    void printInorder(Node node){
        if (node == null) { return ;}

        printInorder(node.left);
        System.out.println(node.data+" ") ; 
        printInorder(node.right);
    }
}
public class construct {
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(); 
        int pre[] = {10, 5, 1, 7, 40, 25, 50} ; 
        int size = pre.length ; 
        Node root = tree.constructTree(pre, size) ; 

        System.out.println("In_order traversal of the constructed tree : ") ; 
        tree.printInorder(root);

        System.out.println("\n") ; 
    }
}
