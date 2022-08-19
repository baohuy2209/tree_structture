class Node {
    constructor(data){
        this.data = data; 
        this.right = null ; 
        this.left = null ; 
    }
    get rightNode(){return this.right;}
    set rightNode(node){this.right = node;}

    get leftNode(){return this.left;}
    set leftNode(node){this.left = node;}

    get Data(){return this.data;}
    set Data(d){this.data = d ;}
}

var root = null ; 
function insert(node,data){
    if(node == null){
        return new Node(data) ; 
    }

    if(node.data > data){
        node.left = insert(node.left,data) ; 
    }

    if(node.data < data){
        node.right = insert(node.right,data) ; 
    }

    return node ; 
}

function printinorder(node){
    if(node != null) {
        printinorder(node.left) ; 
        console.log(node.data+" ") ; 
        printinorder(node.right) ; 
    }
}
function minvalue(root){
    let min = root.data ; 
    while(root != null){ 
        min = root.left.data ; 
        root = root.left ; 
    }

    return min; 
}
function deleteKey(data){
    root = deleteRec(root,data) ; 
}
function deleteRec(root,data){
    if(root == null){
        return root ; 
    }

    if(root.data > data){
        root.left = deleteRec(root.left, data); 
    }
    if(root.data < data){
        root.right = deleteRec(root.right, data) ; 
    }else{
        if(root.right == null){
            return root.left; 
        }
        if(root.left == null){
            return root.right; 
        }

        root.data = minvalue(root.right) ; 
        root.right = deleteRec(root.right,root.data) ; 
    }

    return root ; 
}

root = insert(root,50) ;
root = insert(root,30) ;
root = insert(root,20) ;
root = insert(root,40) ;
root = insert(root,60) ;
root = insert(root,70) ;
root = insert(root,80) ;
root = insert(root,10) ;
console.log("In-order traversal of the tree : ") ; 
printinorder(root) ;

deleteKey(30) ; 
deleteKey(80) ; 
console.log("In-order traversal of the tree modified :") ; 
printinorder(root) ; 