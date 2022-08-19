class Node{
    constructor(data){
        this.data = data ; 
        this.right = null ; 
        this.left = null ; 
    }
}

class Sum{
    constructor(){
        this.addvalue = 0 ; 
    }
}

function convertTree(node, sum){
    if(node == null){
        return ; 
    }

    convertTree(node.left, sum) ; 
    sum.addvalue = sum.addvalue + node.data ; 
    node.data = sum.addvalue ; 
    convertTree(node.right, sum) ; 
}


function printInorder(node){
    if(node == null){
        return ; 
    }

    printInorder(node.left) ; 
    console.log(node.data, " ") ; 
    printInorder(node.right) ; 
}

var root = new Node(5) ;
root.left = new Node(2) ;
root.right = new Node(13) ; 
var sum = new Sum() ; 
convertTree(root, sum) ; 
printInorder(root) ; 
