/*Construct a BST from given pre-order traversal
for example if the given traversal is {10, 5, 1, 7, 40, 50],
then the output should be the root of the following tree.
     10
   /   \
  5     40
 /  \      \
1    7      50 */
 
class Node {
    constructor(data) {
        this.data = data;
        this.left = this.right = null;
    }
}
 
var node;
 
    // This will create the BST
    function createNode(node , data) {
        if (node == null)
            node = new Node(data);
 
        if (node.data > data)
            node.left = createNode(node.left, data);
        if (node.data < data)
            node.right = createNode(node.right, data);
 
        return node;
    }
 
    // A wrapper function of createNode
    function create(data) {
        node = createNode(node, data);
    }
 
    // A function to print BST in inorder
    function inorderRec(root) {
        if (root != null) {
            inorderRec(root.left);
            document.write(root.data+"<br/>");
            inorderRec(root.right);
        }
    }
 
    // Driver Code
        var nodeData = [ 10, 5, 1, 7, 40, 50 ];
        for (i = 0; i < nodeData.length; i++)
        {
            create(nodeData[i]);
        }
        inorderRec(node);
 