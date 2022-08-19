// A O(n^2) Python3 program for
// construction of BST from preorder traversal
 
// A binary tree node
 
 
class Node{
    // A constructor to create a new node
    constructor(data){
        this.data = data
        this.left = null
        this.right = null
    }
}
 
 
// constructTreeUtil.preIndex is a static variable of
// function constructTreeUtil
 
// Function to get the value of static variable
// constructTreeUtil.preIndex
function getPreIndex(){
    return constructTreeUtil.preIndex
}
 
// Function to increment the value of static variable
// constructTreeUtil.preIndex
 
 
function incrementPreIndex(){
    constructTreeUtil.preIndex += 1
}
 
// A recurseive function to construct Full from pre[].
// preIndex is used to keep track of index in pre[[].
 
 
function constructTreeUtil(pre, low, high){
 
        // Base Case
    if(low > high)
        return null
 
    // The first node in preorder traversal is root. So take
    // the node at preIndex from pre[] and make it root,
    // and increment preIndex
    let root = new Node(pre[getPreIndex()])
    incrementPreIndex()
 
    // If the current subarray has onlye one element,
    // no need to recur
    if(low == high)
        return root
 
    let r_root = -1
 
    // Search for the first element greater than root
    for(let i=low;i<high+1;i++){
        if (pre[i] > root.data){
            r_root = i
            break
        }
    }
 
    // If no elements are greater than the current root,
    // all elements are left children
    // so assign root appropriately
    if(r_root == -1)
        r_root = getPreIndex() + (high - low)
 
    // Use the index of element found in preorder to divide
    // preorder array in two parts. Left subtree and right
    // subtree
    root.left = constructTreeUtil(pre, getPreIndex(), r_root-1)
 
    root.right = constructTreeUtil(pre, r_root, high)
 
    return root
}
 
// The main function to construct BST from given preorder
// traversal. This function mailny uses constructTreeUtil()
 
 
function constructTree(pre){
    let size = pre.length
    constructTreeUtil.preIndex = 0
    return constructTreeUtil(pre, 0, size-1)
}
 
function printInorder(root){
    if(root == null)
        return
    printInorder(root.left)
    console.log(root.data,' ')
    printInorder(root.right)
}
 
 
// Driver code
let pre = [10, 5, 1, 7, 40, 50]
 
let root = constructTree(pre)
console.log("Inorder traversal of the constructed tree:","</br>")
printInorder(root)