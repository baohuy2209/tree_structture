class Node {
    constructor(data) {
        this.data = data ; 
        this.left = null ; 
        this.right = null ; 
    }
}
class Sum {
    constructor(){
        this.addvalue = 0 ; 
    }
}
function printPreorder(node) {
    if (node == null){
        return ; 
    }
    console.log(node.data," ") ; 
    printPreorder(node.left) ; 
    printPreorder(node.right) ; 
}

function TranformTree(node, presum){
    if(node = null){
        return ; 
    }

    TranformTree(node.right, presum) ; 
    presum.addvalue = presum.addvalue + node.data ; 
    node.data = presum.addvalue - node.data ; 
    TranformTree(node.left, presum) ; 
}

function insert(node, data){
    if(node == null){
        return new Node(data) ; 
    }

    if(node.data > data){
        node.left = insert(node.left, data) ; 
    }

    if(node.data < data){
        node.right = insert(node.right, data) ; 
    }

    return node ; 
}

function create(node, arr, size){
    for(var i = 0 ; i < size; i++){
        node = insert(node, arr[i]) ; 
    }
}

var sum = new Sum()
var root = new Node(10) ; 
var arr = [5,1,7,40,50] ; 
create(root, arr, arr.length-1) ; 

TranformTree(root, sum) ;

console.log("Preorder traversal of the modified tree : \n") ; 
printPreorder(root) ; 