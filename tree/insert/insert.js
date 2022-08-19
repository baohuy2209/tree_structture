class node {
    constructor(data) {
        this.data = data ; 
        this.left = null ; 
        this.right = null ; 
    }
}

var root = null ; 

function insert(node, data){
    if(node == null){
        return new node(data) ; 
    }
    if(data > node.data){
        node.right = insert(node.right, data) ; 
    }

    if(data < node.data){
        node.left = insert(node.left, data);
    }

    return node ; 
}
function insertRec(data){
    root = insert(root,data)
}

function printInorder(node){
    if (node == null){
        return ;
    }

    printInorder(node.left);
    console.log(+node.data+" ");
    printInorder(node.right) ; 
}

insertRec(10) ; 
insertRec(5) ; 
insertRec(1) ; 
insertRec(7) ; 
insertRec(40) ; 
insertRec(50) ; 
insertRec(20) ; 


console.log("Inorder traversal of the tree : ") ; 
printInorder(root) ; 