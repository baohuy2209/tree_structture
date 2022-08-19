using System ; 
using System.Collections ; 

namespace tree.Construct_all_possible_BSTs_for_keys_1_to_N{
    class Node{
        public int data;
        public Node left ; 
        public Node right ; 
        public Node(int data){
            this.data = data ; 
            this.right = null ; 
            this.left = null ; 
        }

        public int getData() {return this.data ;}
        public void setData(int data) {this.data = data ;}

        public Node getRight() {return this.right ;}
        public Node getLeft() {return this.left ;}

        public void setRight(Node n) {this.right = n ;}
        public void setleft(Node n) {this.left = n ;}

        public int item{
            get {return data;}
            set {data = value;}
        }
        public Node l {
            get {return left;}
            set {left = value;}
        }
        public Node r {
            get {return right;}
            set {right = value ;}
        }
    }

    class BinaryTree{
        static void printInorder(Node node){
            if(node == null){
                return ; 
            }

            printInorder(node.left) ; 
            Console.Write(Convert.ToString(node.data)+" ") ; 
            printInorder(node.right) ; 
        }

        static ArrayList constructTrees(int start, int end){
            ArrayList list = new ArrayList() ; 
            if(start > end){
                list.Add(null) ; 
                return list ; 
            }

            for(int i = start; i <= end; i++){
                ArrayList leftsubtree = constructTrees(start, i-1) ; 

                ArrayList rightsubtree = constructTrees(i+1, end) ; 

                for(int j = 0 ; j < leftsubtree.Count ; i++){
                    Node left = (Node)leftsubtree[j] ;
                    for(int k = 0 ; k < rightsubtree.Count ; k++){
                        Node right = (Node)rightsubtree[k] ;
                        Node node = new Node(i) ; 
                        node.left = left ; 
                        node.right = right ; 

                        list.Add(node) ;  
                    } 
                }
            }

            return list ; 
        }
        public static void Main(String []args)
        {
            ArrayList totalTreesFrom1toN = constructTrees(1, 3);
            
            /* Printing preorder traversal
            of all constructed BSTs */
            Console.WriteLine("Preorder traversals of all" +
                                    "constructed BSTs are ");
            for (int i = 0; i < totalTreesFrom1toN.Count; i++)
            {
                printInorder((Node)totalTreesFrom1toN[i]);
                Console.WriteLine();
            }
        }
     
    }
}