INT_MIN = -float("inf") 
INT_MAX = float("inf")

class Node:
    def __init__(self, data):
        self.data = data 
        self.right = None 
        self.left = None 

def getPreIndex():
    return constructTreeUtil.preIndex 

def incrementPreIndex():
    constructTreeUtil.preIndex = constructTreeUtil.preIndex + 1 

def printInorder(node):
    if node is None :
        return 
    printInorder(node.left) 
    print(node.data, end = " ")
    printInorder(node.right)

def constructTreeUtil(pre, key, min, max, size):
    if (getPreIndex() > size):
        return None 

    root = None 

    if(key < max and key > min):
        root = Node(key) ; 
        incrementPreIndex()

        if(getPreIndex() < size):
            root.left = constructTreeUtil(pre, pre[getPreIndex()], min, key, size) 

        if getPreIndex() < size :
            root.right = constructTreeUtil(pre, pre[getPreIndex()], key, max, size) 


    return root 

def constructTree(pre):
    constructTreeUtil.preIndex = 0 ; 
    size = len(pre) ; 
    return constructTreeUtil(pre, pre[0], INT_MIN, INT_MAX, size)

pre = [10,5,1,7,40,50]

node = constructTree(pre)

print("In_order traversal of the constructed tree : ") 
printInorder(node) 