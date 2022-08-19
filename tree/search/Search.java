package search; 


class node {
    public int data ; 
    public node left ; 
    public node right ; 
    public node(int d){
        this.data = d ; 
        this.left = null ; 
        this.right = null ; 
    }
}

class BST {
    public node root; 
    public BST(){
        this.root = null ; 
    }

    public void printInorder(){
        inorder(root) ; 
    }
    private void inorder(node node){
        if(node == null){
            return ; 
        } 
        inorder(node.left);
        System.out.print(node.data+" ") ; 
        inorder(node.right);
    }

    public node search(node node, int data){
        if(node == null || node.data == data){
            return node ; 
        }

        if(node.data > data){
            return search(node.left, data) ; 
        }
        return search(node.right, data) ;
    }

    public node insert(node node,int data){
        if(node == null){
            return new node(data) ; 
        }

        if(node.data > data){
            node.left = insert(node.left, data) ; 
        }
        if(node.data < data){
            node.right = insert(node.right, data) ; 
        }

        return node ; 
    }

    public static void main(String[] args){
        BST tree = new BST();
        tree.root=tree.insert(tree.root, 10) ;
        
        tree.insert(tree.root, 5) ; 
        tree.insert(tree.root, 1) ;
        tree.insert(tree.root, 7) ; 
        tree.insert(tree.root, 40) ; 
        tree.insert(tree.root, 50) ; 

        if(tree.search(tree.root, 40) != null){
            System.out.println("Found !!!") ; 
        }else{
            System.out.println("Not found !!!") ; 
        }

        System.out.println("Inorder traversal of the tree : ") ; 
        tree.printInorder();

        System.out.println("\n") ; 
    }
}

