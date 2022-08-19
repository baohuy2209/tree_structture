class Node{
    constructor(data){
        this.data = data; 
        this.right = null ; 
        this.left = null ;
    } 
}

function constructTree(start, end){
    let lst = []
    if(start > end){
        lst.push(null) ; 
        return lst ; 
    }

    for(var i = start; i <= end; i++){
        let leftsubtree = constructTree(start, i-1) ; 
        let rightsubtree = constructTree(i+1, end); 
        for(var j = 0 ; j < leftsubtree.length ; j++) {
            let left = leftsubtree[j] ; 
            for(var k = 0 ; k < rightsubtree.length; k++){
                let right = rightsubtree[k] ; 
                let node = new Node(i) ; 
                node.right = right ; 
                node.left = left ; 
                
                lst.push(node) ; 
            }
        }
    }

    return lst ; 
}

function preorder(node){
    if(node == null){
        return ; 
    }

    console.log(node.data, " ") ; 
    preorder(node.left); 
    preorder(node.right) ; 
}

var list = constructTree(1, 5) 
for (var i = 0 ; i < list.length; i++){
    console.log("Preorder traversal : ") ; 
    preorder(list[i]) ; 
    console.log("\n") ; 
}