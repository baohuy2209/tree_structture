class Node
{
    constructor(item)
    {
        this.data = item;
        this.left=null;
        this.right=null;
    }
}
 
let sum = 0;
let Root;
 
// Recursive function to transform a BST
// to sum tree. This function traverses
// the tree in reverse inorder so that
// we have visited all greater key nodes
// of the currently visited node
function transformTreeUtil(root)
{
     
    // Base case
    if (root == null)
      return;
     
    // Recur for right subtree
    transformTreeUtil(root.right);
     
    // Update sum
    sum = sum + root.data;
     
    // Store old sum in current node
    root.data = sum - root.data;
     
    // Recur for left subtree
    transformTreeUtil(root.left);
}
 
// A wrapper over transformTreeUtil()
function transformTree(root)
{
    transformTreeUtil(root);
}
 
// A utility function to print indorder
// traversal of a binary tree
function printInorder(root)
{
    if (root == null)
          return;
           
    printInorder(root.left);
     
    document.write(root.data + " ");
    printInorder(root.right);
}
 
// Driver code
Root = new Node(11);
Root.left = new Node(2);
Root.right = new Node(29);
Root.left.left = new Node(1);
Root.left.right = new Node(7);
Root.right.left = new Node(15);
Root.right.right = new Node(40);
Root.right.right.left = new Node(35);
 
document.write("Inorder Traversal of given tree<br>");
printInorder(Root);
 
transformTree(Root);
document.write("<br><br>Inorder Traversal of " +
               "transformed tree<br>");
printInorder(Root);
 