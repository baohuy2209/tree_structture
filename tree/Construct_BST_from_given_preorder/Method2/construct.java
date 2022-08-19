package Construct_BST_from_given_preorder.Method2;
class Node{
    public int data; 
    public Node right ; 
    public Node left ; 
    public Node() {}
    public Node(int data){
        this.data = data; 
        this.right = null ; 
        this.left = null ; 
    }

    public int getData(){ return this.data ;}
    public void getData(int key){ this.data = key ; }
    public Node getRight(){ return this.right ;}
    public Node getLeft(){ return this.left ;}
    public void setLeft(Node left){ this.left = left ;}
    public void setRight(Node right){ this.right = right ;}
}
class Index {
    public int index = 0 ; 
}
class BinaryTree{
    public Index index = new Index() ; 
    public void printInorder(Node root){
        if(root == null){
            return ; 
        }
        printInorder(root.left);
        System.out.print(root.data+" ") ;
        printInorder(root.right); 
    }

    public Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size){
        if (preIndex.index > size){
            return null ; 
        }

        Node node = null ; 
        if(key < max && key > min){
            node = new Node(pre[preIndex.index]) ; 
            preIndex.index = preIndex.index + 1 ; 

            if (preIndex.index < size){
                node.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size) ; 
            }

            if (preIndex.index > size){
                node.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size) ; 
            }
        }

        return node ; 
    }

    public Node constructTree(int pre[], int size){
        return constructTreeUtil(pre, index, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size) ;
    }
}
public class construct {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree() ; 
        int pre [] = new int [] {10,5,1,7,40,50} ; 
        int size = pre.length ; 

        Node root = tree.constructTree(pre, size) ; 
        System.out.println("In_order traversal of the constructed tree : ") ; 
        tree.printInorder(root);

        System.out.println("\n") ; 
    }
}
