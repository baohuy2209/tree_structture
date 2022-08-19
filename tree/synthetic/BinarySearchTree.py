class Node:
    def __init__(self, data):
        self.data = data 
        self.right = None 
        self.left = None 

    def getData(self):
        return self.data 
    def setData(self, data):
        self.data = data 

    def getLeft(self):
        return self.left 
    def setLeft(self, n):
        self.left = n 
    
    def getRight(self):
        return self.right 
    def setRight(self, n):
        self.right = n 


root = None 
def isEmpty(node):
    return root is None 

def newNode(key):
    node = Node(key)
    return node 

def insertRec(node, data):
    if node is None : 
        return newNode(data)
    
    if node.data < data : 
        node.left = insertRec(node.left, data)
    if node.data > data :
        node.right = insertRec(node.right, data)

    return node 

def insert(data):
    root = insertRec(root, data)

def minvalue(node):
    current = node 
    min = 0 ; 
    while current is not None :
        min = current.left.data 
        current = current.left 
    return min 

def deleteRec(node, data):
    if node is None :
        return node 

    if data < node.data : 
        node.left = deleteRec(node.left, data)
    elif data > node.data : 
        node.right = deleteRec(node.right, data)
    else :
        if node.left is None : 
            return node.right 
        elif node.right is None :
            return node.left 

        node.data = minvalue(node.right)
        node.right = deleteRec(node.right , node.data)
    return node 

def delete(data):
    root = deleteKey(root, data)

def inorder(node):
    if node is None :
        return 
    inorder(node.left)
    print(node.data, end = " ")
    inorder(node.right)

def printInorder():
    inorder(root)

def preorder(node):
    if node is None :
        return 
    print(node.data, end = " ")
    preorder(node.left)
    preorder(node.right)

def printPreorder():
    preorder(root)

def postorder(node):
    if node is None : 
        return 
    postorder(node.left) 
    postorder(node.right) 
    print(node.data, end = " ")

def printPostorder():
    postorder(root)

def search(item):
    if searchRec(root, item) is None : 
        return False 
    else : 
        return True 

def searchRec(node, data):
    if node is None or node.data == data : 
        return node 
    if node.data > data : 
        return searchRec(node.left, data) 
    return searchRec(node.right, data)

def countNodes(node):
    if node is None : 
        return 0
    return countNodes(node.left) + countNodes(node.right) + 1 

if __name__ == "__main__":
    print("List operation with tree .")
    print("1. Insert new node .")
    print("2. Delete node .")
    print("3. In_order traversal of the tree .")
    print("4. Pre_order traversal of the tree .")
    print("5. Post_order traversal of the tree .")
    print("6. Get number of node in the tree .")
    print("7. Search element .")
    print("8. Sorted Linked List to Balance .")
    print("9. Sorted Array to Balance .")
    print("10. Binary Tree to Binary Search Tree Conversion .")
    print("11. Transform a BST to greater sum tree .") 
    print("12. Construct all possible BSTs for keys 1 to N .")
    print("13. Convert a BST to a Binary Tree such that sum of all greater keys is added every key .")
    print("14. BST to a Tree with sum of all smaller keys .") 
    print("15. In-place Convert BST into a Min-heap .") 
    print("16. Convert BST to Min heap .")
    print("17. Construct BST from its given level order traversal .")
    print("18. Reverse a path in BST using queue .")
    print("19. Binary Tree to BST Conversion using STL set .")
    print("20. Check given array of size n can represent BST of n levels or not .") 
    print("21. Convert a normal BST to Balanced BST .")
    print("22. Merge two BSTs with limited extra space .") 