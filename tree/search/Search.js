class node {
    constructor(data) {
        this.data = data ; 
        this.left = null ; 
        this.right = null ; 
    }
}

var root = new node(null) ; 

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

function printInorder(node){
    if (node == null){
        return ;
    }

    printInorder(node.left);
    console.log(+node.data+" ");
    printInorder(node.right) ; 
}

function search(node, data){
    if(node == null || node.data == data){
        return node ; 
    }

    if(node.data > data){
        return search(node.left,data) ; 
    }

    return search(node.right,data) ; 
}

function main(){
    root = insert(root,10) ; 
    root = insert(root,5) ; 
    root = insert(root,1) ; 
    root = insert(root,7) ; 
    root = insert(root,40) ; 
    root = insert(root,50) ; 

    if(search(root, 50)){
        console.log("Found !!!") ; 
    }else{
        console.log("Not found !!!") ; 
    }

    console.log("Inorder traversal of the tree : ") ; 
    printInorder(root) ; 
}

main() ; 