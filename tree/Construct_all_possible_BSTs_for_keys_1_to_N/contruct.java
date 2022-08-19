package Construct_all_possible_BSTs_for_keys_1_to_N;

import java.util.ArrayList ; 
class Node{
    public int data ; 
    public Node left ; 
    public Node right ; 

    public Node(int data){
        this.data = data ; 
        this.left = null ; 
        this.right = null ; 
    }
}

class BinaryTree{
    static ArrayList<Node> constructTree(int start, int end){
        ArrayList<Node> lst = new ArrayList<>() ; 

        if(start > end){
            lst.add(null) ; 
            return lst; 
        }

        for(int i = start; i <= end; i++){
            ArrayList<Node> leftsubtree = constructTree(start, i-1) ; 
            ArrayList<Node> rightsubtree = constructTree(i+1, end) ; 

            for(int j = 0 ; j < leftsubtree.size() ; j++){
                Node left = leftsubtree.get(j) ;
                for(int k = 0 ; k < rightsubtree.size() ; k++){
                    Node right = rightsubtree.get(k) ; 
                    Node root = new Node(i) ; 
                    root.left = left ; 
                    root.right = right ; 

                    lst.add(root) ; 
                }
            }
        }

        return lst ; 
    }

    static void printInorder(Node node){
        if(node == null){
            return ; 
        }
        System.out.println(node.data+" ") ; 
        printInorder(node.left);
        printInorder(node.right); 
    }
}
public class contruct {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree() ; 
        ArrayList<Node> total = tree.constructTree(1, 4) ; 
        System.out.println("Inorder traversal : ") ; 
        for(int i = 0 ; i < total.size() ; i++){
            tree.printInorder(total.get(i));
            System.out.println("\n") ; 
        }
    }
}
