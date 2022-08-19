
import java.util.Scanner;

class BSTNode{
    protected BSTNode left, right ; 
    protected int data; 

    public BSTNode(){
        this.data = 0 ; 
        this.left = null ; 
        this.right = null ; 
    }

    public BSTNode(int d){
        this.data = d ; 
        this.right = null; 
        this.left = null ; 
    }

    public void setLeft(BSTNode n){
        this.left = n ; 
    }
    public void setRight(BSTNode n){
        this.right = n ; 
    }

    public BSTNode getLeft(){
        return this.left ; 
    }
    public BSTNode getRight(){
        return this.right ; 
    }

    public int getData(){
        return this.data ; 
    }
    public void setData(int d){
        this.data = d ; 
    }
}

class BST {
    private BSTNode root ; 
    public BST(){
        this.root = null ; 
    }

    public boolean isEmpty(){
        return this.root == null ; 
    }

    public void insert(int data){
        this.root = insertRec(this.root, data) ; 
    }

    private BSTNode insertRec(BSTNode node,int data){
        if(node == null){
            return new BSTNode(data) ; 
        }

        if(node.data > data){
            node.left = insertRec(node.left, data) ; 
        }
        if(node.data < data){
            node.right = insertRec(node.right, data) ; 
        }

        return node ; 
    }

    public void printInorder(){
        inorder(this.root) ; 
    }

    private void inorder(BSTNode node){
        if(node == null){
            return ; 
        }

        inorder(node.left) ; 
        System.out.print(node.data+" ") ;
        inorder(node.right) ;  
    }

    public void printPreorder(){
        preorder(this.root) ; 
    }

    private void preorder(BSTNode node){
        if(node == null){
            return ; 
        }

        System.out.print(node.data+" ") ; 
        preorder(node.left) ; 
        preorder(node.right) ; 
    }

    public void printPostorder(){
        postorder(this.root) ; 
    }

    public void postorder(BSTNode node){
        if (node == null){
            return ; 
        }

        postorder(node.left) ; 
        postorder(node.right);
        System.out.print(node.data+" ") ; 
    }

    public boolean searchRec(int data){
        return search(this.root, data) != null;  
    }

    private BSTNode search(BSTNode node, int data){
        if(node == null || node.data == data){
            return node ; 
        }

        if(node.data > data){
            return search(node.left, data) ; 
        }

        return search(node.right,data) ; 
    }

    public int Count(){
        return count(this.root) ; 
    }

    private int count(BSTNode node){
        if(node == null){
            return 0 ; 
        }else{
            int l = 1 ; 
            l += count(node.left) ; 
            l += count(node.right) ; 
            return l ; 
        }
    }

    public int minValueNode(BSTNode node){
        int minv = node.data ; 
        while(node.left != null){
            minv = root.left.data ; 
            root = root.left ; 
        }
        return minv ; 
    }

    public void deleteKey(int data){ this.root = deleteRec(this.root,data) ;}

    private BSTNode deleteRec(BSTNode node, int data){
        if(node == null){
            return node ; 
        }

        if(data < node.data){
            node.left = deleteRec(node.left, data) ; 
        }
        else if(data > node.data){
            node.right = deleteRec(node.right, data) ; 
        }else{
            if (node.left == null){
                return node.right ; 
            }else if (node.right == null){
                return node.left ; 
            }

            node.data = minValueNode(node.right) ; 
            node.right = deleteRec(node.right, node.data) ; 
        }

        return node ; 
    }

    public void constructTree(int [] data){
        for(int i = 0 ; i < data.length ; i++){
            insert(data[i]) ; 
        }
    }
}

public class binarysearchtree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in) ; 
        boolean check = false ; 
        BST tree = new BST() ; 
        System.out.println("Binary search tree operation :") ; 
        System.out.println("=============================") ; 
        System.out.println("1. Insert new node .") ; 
        System.out.println("2. Delete node in binary search tree .") ; 
        System.out.println("3. In-order traversal of the tree .") ; 
        System.out.println("4. Pre-order traversal of the tree .") ; 
        System.out.println("5. Post-order traversal of the tree .") ; 
        System.out.println("6. Get size of the tree .") ; 
        System.out.println("7. Check empty status .") ; 
        System.out.println("8. Construct BST from given preorder traversal .") ; 
        System.out.println("9. Search element .") ;
        System.out.println("10. Exit .") ; 
        while(!check){
            System.out.println("\n Enter the operation which you want to execute : ") ; 
            int choice = scan.nextInt() ; 

            switch(choice){
                case 1:
                    System.out.println("Enter data to insert :") ; 
                    int data = scan.nextInt() ; 
                    tree.insert(data);
                    break ; 

                case 2:
                    System.out.println("Enter data to delete :") ; 
                    int d = scan.nextInt() ; 
                    tree.deleteKey(d);
                    tree.printInorder(); 
                    break ; 

                case 3: 
                    System.out.println("Inorder traversal of the given tree :") ; 
                    tree.printInorder();
                    break ; 

                case 4: 
                    System.out.println("Preorder traversal of the given tree :") ; 
                    tree.printPreorder(); 
                    break ; 

                case 5: 
                    System.out.println("Postorder traversal of the given tree :") ; 
                    tree.printPostorder();
                    break ; 
                case 6: 
                    System.out.println("Size of the binary search tree : "+tree.Count()) ; 
                    break ; 

                case 7:
                    System.out.println("Check empty status = "+tree.isEmpty()) ;
                    break ; 
                    
                case 8: 
                    System.out.println("Enter length of the array - given preorder :") ; 
                    int n = scan.nextInt() ; 
                    int [] arr = new int [10000] ; 
                    System.out.println("Enter the elements of the preorder traversal :") ; 
                    for (int i = 0 ; i< n ; i++){
                        arr[i] = scan.nextInt(); 
                    }
                    tree.constructTree(arr);
                    break ;
                    
                case  9:
                    System.out.println("Enter the element to search :") ; 
                    int da = scan.nextInt() ; 
                    if(tree.searchRec(da)){
                        System.out.println("Found !!!") ; 
                    } else{
                        System.out.println("Not found !!!") ; 
                    }

                    break ; 
                case 10:
                    System.out.println("Exit loop .") ; 
                    check = true ; 
                    break ; 
                default:
                    System.out.println("Wrong Entry !!!") ; 
                    break ; 
            }
        }

        System.out.println("=============================") ; 
        System.out.println("End .") ; 
    }
}
