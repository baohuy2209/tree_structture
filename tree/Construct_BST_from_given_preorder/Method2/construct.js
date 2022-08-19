class Node {
 
    constructor(d) {
        this.data = d;
        this.left = this.right = null;
    }
}
 
class Index {
    constructor(){
    this.index = 0;
    }
}
 
index = new Index();
 
    // A recursive function to construct BST from pre.
    // preIndex is used to keep track of index in pre.
function constructTreeUtil(pre,  preIndex , key , min , max , size) {
 
        // Base case
    if (preIndex.index >= size) {
        return null;
    }
 
    var root = null;
 
        // If current element of pre is in range, then
        // only it is part of current subtree
    if (key > min && key < max) {
 
            // Allocate memory for root of this
            // subtree and increment *preIndex
        root = new Node(key);
        preIndex.index = preIndex.index + 1;
 
        if (preIndex.index < size) {
 
                // Construct the subtree under root
                // All nodes which are in range {min .. key}
                // will go in left subtree, and first such
                // node will be root of left subtree.
            root.left = constructTreeUtil(pre, preIndex,pre[preIndex.index], min, key, size);
        }
        if (preIndex.index < size){
             
                // All nodes which are in range {key..max}
                // will go in right subtree, and first such
                // node will be root of right subtree.
            root.right = constructTreeUtil(pre, preIndex,pre[preIndex.index], key, max, size);
        }
    }
 
    return root;
}
 
    // The main function to construct BST from given
    // preorder traversal. This function mainly uses
    // constructTreeUtil()
function constructTree(pre , size) {
    var preIndex = 0;
    return constructTreeUtil(pre, index, pre[0],Number.MIN_VALUE, Number.MAX_VALUE, size);
}
 
    // A utility function to print inorder traversal of a
    // Binary Tree
function printInorder(node) {
    if (node == null) {
        return;
    }
    printInorder(node.left);
    document.write(node.data + " ");
    printInorder(node.right);
}
 
    // Driver code
var pre =[ 10, 5, 1, 7, 40, 50 ];
var size = pre.length;
 
        // Function call
var root = constructTree(pre, size);
document.write("Inorder traversal of the constructed tree is <br/>");
printInorder(root);