class Node:
    def __init__(self, data):
        self.data = data 
        self.right = None 
        self.left = None 
    
def constructTrees(start, end) ->list[list[int]]:
    lst = []

    if start > end:
        lst.append(None)
        return lst 
    for i in range(start, end+1):
        leftsubtree = constructTrees(start, i - 1 ) 
        rightsubtree = constructTrees(i+1, end) 
        for j in range(len(leftsubtree)):
            left = leftsubtree[j] 
            for k in range(len(rightsubtree)): 
                right = rightsubtree[k]
                root = Node(i) 
                root.left = left 
                root.right = right 

                lst.append(root)
    
    return lst 

def printPreorder(node):
    if node is None :
        return 
    print(node.data, end = " ")
    printPreorder(node.left)
    printPreorder(node.right) 

li = constructTrees(1, 4)
for item in li:
    print("Preorder traversal of the tree :")
    printPreorder(item)
    print("\n") 
    