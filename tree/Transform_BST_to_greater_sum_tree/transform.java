package Transform_BST_to_greater_sum_tree;

class Node{
    public int data ; 
    public Node right ; 
    public Node left ; 

    public Node(int data){
        this.data = data ; 
        this.right = null ; 
        this.left = null ; 
    }

    public int getData() {return this.data ;}
    public Node getLeft() {return this.left ;}
    public Node getRight() {return this.right ;} 

    public void setData(int key){ this.data = key ;} 
    public void setLeft(Node n) { this.left = n ;}
    public void setRight(Node n) { this.right = n ;}
}
class Sum{
    public int addvalue = 0 ; 
}
class BinaryTree{
    Sum sum = new Sum() ; 
    public void printPreorder(Node node){
        if(node == null){
            return ; 
        }
        System.out.print(node.data+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void TransformTreeUtil(Node node, Sum presum){
        if(node == null){
            return ; 
        }

        TransformTreeUtil(node.right, presum) ;
        presum.addvalue = presum.addvalue + node.data ; 
        node.data = presum.addvalue - node.data ; 
        TransformTreeUtil(node.left, presum); 
    }

    public void transformTree(Node node){
        TransformTreeUtil(node, sum);
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

    public void create(Node node, int arr[], int size){
        for(int i = 0 ; i < size ; i++){
            node = insert(node, arr[i]) ; 
        }
    }
}
public class transform {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree() ; 
        Node root = new Node(10) ; 
        int arr[] = {5, 1, 7, 40, 50} ;
        tree.create(root, arr, arr.length);
        
        tree.transformTree(root);
        System.out.println("Preorder traversal of the new tree : ") ; 
        tree.printPreorder(root); 
    }
    
}
