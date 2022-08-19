class Node:
    def __init__(self, data):
        self.data = data 
        self.right = None 
        self.left= None 

def countNodes(node) ->int :
    if node is None : 
        return 0 ; 

    return countNodes(node.right) + countNodes(node.left) + 1 

def storeInorder(node : Node, arr: list[int]):
    if node is None :
        return 
    
    storeInorder(node.left, arr)
    x = node.data 
    arr.append(x) 
    storeInorder(node.right, arr)

def arrayToBST(node: Node, arr: list[int]):
    if node is None :
        return 
    arrayToBST(node.left, arr)
    node.data = arr[0] ; 
    arr.pop(0) 
    arrayToBST(node.right, arr)

def printInorder(node : Node):
    if node is None :
        return 
    printInorder(node.left)
    print(node.data, end = " ")
    printInorder(node.right)

def binaryToBST(node : Node):
    if node is None : 
        return 
    arr = [] 
    storeInorder(node, arr)

    arr.sort() 

    arrayToBST(node, arr)

root = Node(10) 
root.left = Node(15) 
root.right = Node(20) 
root.left.left = Node(9) 
root.left.right = Node(5) 

root.right.right = Node(80)
root.right.left = Node(50) 

binaryToBST(root) 
print("Inorder traversal of the constructed tree : \n")
printInorder(root) 

