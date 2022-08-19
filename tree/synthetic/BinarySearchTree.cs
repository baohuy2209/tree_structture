using System ; 

namespace tree.synthetic{
    class Node{
        public int data ; 
        public Node right, left ;
        public Node(){
            this.data = 0; 
            this.left = null ;
            this.right = null ;  
        }

        public Node(int data){
            this.data = data ; 
            this.left = null ; 
            this.right = null ; 
        }

        public int getData(){
            return this.data ; 
        }
        public void setData(int data){
            this.data = data ; 
        }

        public Node getLeft(){
            return this.left ; 
        }
        public Node getRight(){
            return this.right ; 
        }

        public void setLeft(Node n){
            this.left = n ; 
        }
        public void setRight(Node n){
            this.right = n ; 
        }
    }

    class BST{
        public Node root ; 
        public BST(){
            this.root = null ; 
        }

        public bool isEmpty(){
            return this.root == null ; 
        }

        public int CountNode(){
            return countnode(this.root); 
        }
        private int countnode(Node node){
            if(node == null){
                return 0 ; 
            }else{
                int l = 1 ; 
                l += countnode(node.left) ; 
                l += countnode(node.right) ;
                return l ;  
            }
        }
        public void printInorder(){
            inorder(this.root) ; 
        } 
        private void inorder(Node node){
            if(node != null){
                inorder(node.left) ; 
                Console.Write(node.data+" ");
                inorder(node.right) ; 
            }
        }

        public void printPreorder(){
            preorder(this.root) ; 
        }
        public void printPostorder(){
            postorder(this.root) ; 
        }

        private void preorder(Node node){
            if(node == null){
                return ; 
            }
            Console.Write(node.data+" ") ; 
            preorder(node.left) ; 
            preorder(node.right) ; 
        }
        private void postorder(Node node){
            if(node == null){
                return ; 
            }

            postorder(node.left) ; 
            postorder(node.right) ; 
            Console.Write(node.data+" ") ; 
        }

        public void insert(int data){
            this.root = insertRec(this.root, data);
        } 
        private Node insertRec(Node node, int data){
            if(node == null){
                Node tmp = new Node(data) ; 
                node = tmp ; 
                return node ; 
            }

            if(node.data > data){
                node.left = insertRec(node.left, data) ; 
            }

            if(node.data < data){
                node.right = insertRec(node.right, data) ; 
            }

            return node ; 
        }

        public void deleteKey(int data){
            this.root = deleteRec(this.root, data) ; 
        }

        private int minValue(Node node){
            int min = node.data ; 
            while(node != null){
                min = node.left.data ; 
                node = node.left ; 
            }

            return min; 
        }

        public Node deleteRec(Node node, int data){
            if(node == null){
                return node ; 
            }

            if(node.data < data){
                node.right = deleteRec(node.right, data) ; 
            }else if(node.data > data){
                node.left = deleteRec(node.left, data) ; 
            }else{
                if(node.right == null){
                    return node.left; 
                }else if(node.left == null){
                    return node.right; 
                }

                node.data = minValue(node.right) ; 
                node.right = deleteRec(node.right, node.data) ; 
            }
            return node ; 
        }

        public bool Search(int item){
            return searchRec(this.root, item) != null ; 
        }

        private Node searchRec(Node node, int data){
            if(node == null || node.data == data){
                return node ; 
            }

            if(node.data < data){
                node.right = searchRec(node.right, data) ; 
            }

            return node.left = searchRec(node.left, data) ; 
        }
        private Node constructTreeUtil(Node node, int [] arr, int n){
            for (int i = 0 ; i < n; i++){
                node = insertRec(node, arr[i]) ; 
            }

            return node ; 
        }

        public Node constructTree(int [] arr, int n){
            return constructTreeUtil(this.root, arr, n) ; 
        }
    }

    public class Program{
        public static void Main(string[] args){
            int [] array = new int[1000] ;
            BST tree = new BST(); 
            bool check = false ; 
            Console.WriteLine("Binary Search Tree operation :") ; 
            Console.WriteLine("==================================================") ; 
            Console.WriteLine("1. Insert new node .") ; 
            Console.WriteLine("2. Delete node in binary search tree .") ; 
            Console.WriteLine("3. In-order traversal of the BST .") ; 
            Console.WriteLine("4. Pre-order traversal of the BST .") ; 
            Console.WriteLine("5. Post-order traversal of the BST .") ; 
            Console.WriteLine("6. Number of nodes in the tree .") ; 
            Console.WriteLine("7. Check empty status .") ; 
            Console.WriteLine("8. Construct BST from given pre-order traversal .") ; 
            Console.WriteLine("9. Search element in BST .") ;
            Console.WriteLine("10. Exit") ;  
            Console.WriteLine("==================================================") ; 

            while(!check){
                Console.WriteLine("\n Enter the operation with tree :") ; 
                int choice = Convert.ToInt32(Console.ReadLine()) ;
                switch(choice){
                    case 1:
                        Console.WriteLine("Enter the data to insert :") ; 
                        int data = Convert.ToInt32(Console.ReadLine()) ; 

                        tree.insert(data) ; 
                        break ;

                    case 2: 
                        Console.WriteLine("Enter the data to delete :") ; 
                        int d = Convert.ToInt32(Console.ReadLine()) ; 

                        tree.deleteKey(d) ; 
                        break ; 

                    case 3:
                        Console.WriteLine("In-order traversal of the tree : ") ; 
                        tree.printInorder() ; 

                        break;

                    case 4:
                        Console.WriteLine("Pre-order traversalof the tree : ") ; 
                        tree.printPreorder() ;

                        break ; 

                    case 5: 
                        Console.WriteLine("Post-order traversal of the tree : ") ; 
                        tree.printPostorder() ; 

                        break ; 

                    case 6: 
                        Console.WriteLine("Number of noded in the tree : "+tree.CountNode()) ; 

                        break ; 

                    case 7: 
                        Console.WriteLine("Check empty status = "+tree.isEmpty()) ; 

                        break ; 

                    case 8: 
                        Console.WriteLine("Enter the length of the array : ") ; 
                        int n = Convert.ToInt32(Console.ReadLine()) ; 
                        Console.WriteLine("Enter the elements of the array :") ;
                        for(int i = 0 ; i < n ; i++){
                            Console.WriteLine("Elements : ") ; 
                            array[i] = Convert.ToInt32(Console.ReadLine()) ; 
                        }

                        tree.constructTree(array,n) ; 

                        break ; 
                    case 9:
                        Console.WriteLine("Enter data to search in the tree : ");
                        int nu = Convert.ToInt32(Console.ReadLine()) ; 
                        if(tree.Search(nu)){
                            Console.WriteLine("Found !!!") ; 
                        } else{
                            Console.WriteLine("Not Found !!!") ; 
                        }
                        break ;
                    case 10:
                        check = true ; 
                        break ; 
                    default:
                        Console.WriteLine("Invalid !!!") ; 
                        break ;    
                }
            }

            Console.WriteLine("End .") ; 
        }   
    }
}