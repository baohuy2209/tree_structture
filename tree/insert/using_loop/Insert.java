package insert.using_loop ; 

import java.util.* ;  

public class Insert{
    public static void main(String[] args){
        BST tree = new BST() ;
        tree.insertRec(10) ;  
        tree.insertRec(5) ; 
        tree.insertRec(1) ;
        tree.insertRec(7) ; 
        tree.insertRec(40) ; 
        tree.insertRec(50) ; 

        System.out.println("Inorder traversal of the tree : ") ; 
        tree.printInorder();

        System.out.println("\n") ; 
    }
}

class Node{
    public int data; 
    public Node left; 
    public Node right ; 

    public Node(int d){
        this.data = d ; 
    }

    public Node(){}
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
        Node temp = new Node() ;
        temp = node ; 
        Stack<Node> stack = new Stack<Node>() ; 

        while(temp != null || !stack.isEmpty()){
            if(temp != null){
                stack.add(temp) ; 
                temp = temp.left ; 
            }else{
                temp = stack.pop() ; 
                System.out.println(temp.data+ " ") ;
                temp = temp.right;
            }
        }
    }

    public void insertRec(int data){
        insert(this.root,data) ; 
    }

    private void insert(Node node, int key){
        Node temp = new Node(key) ; 

        if (node == null){
            node = temp;
            return; 
        }

        Node prev = new Node() ; 
        Node tmp = new Node() ; 
        tmp = node ; 

        while(tmp != null){
            if(tmp.data > key){
                prev = tmp ; 
                tmp = tmp.left ; 
            }
            if(tmp.data < key){
                prev = tmp ; 
                tmp = tmp.right ; 
            }
        }
        if (prev.data > key){
            prev.left = node ; 
        }

        if (prev.data < key){
            prev.right = node ; 
        }
    }
}