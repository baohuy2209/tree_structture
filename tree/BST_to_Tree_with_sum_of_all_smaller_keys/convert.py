# Program to change a BST to Binary Tree
# such that key of a Node becomes original 
# key plus sum of all smaller keys in BST
  
# A BST node has key, left child 
# and right child */
class Node: 
  
    # Constructor to create a new node 
    def __init__(self, data): 
        self.key = data 
        self.left = None
        self.right = None
  
# A recursive function that traverses the 
# given BST in inorder and for every key,
# adds all smaller keys to it 
def addSmallerUtil(root, Sum):
      
    # Base Case 
    if root == None: 
        return
  
    # Recur for left subtree first so that 
    # sum of all smaller Nodes is stored 
    addSmallerUtil(root.left, Sum) 
  
    # Update the value at sum 
    Sum[0] = Sum[0] + root.key 
  
    # Update key of this Node 
    root.key = Sum[0] 
  
    # Recur for right subtree so 
    # that the updated sum is 
    # added to greater Nodes 
    addSmallerUtil(root.right, Sum)
  
# A wrapper over addSmallerUtil(). It
# initializes sum and calls addSmallerUtil() 
# to recursively update and use value of
def addSmaller(root):
    Sum = [0] 
    addSmallerUtil(root, Sum)
      
# A utility function to print
# inorder traversal of Binary Tree 
def printInorder(node):
    if node == None: 
        return
    printInorder(node.left) 
    print(node.key, end = " ")
    printInorder(node.right)
  
# Driver Code
if __name__ == '__main__':
      
    # Create following BST 
    #         9 
    #     / \ 
    #     6     15 
    root = Node(9) 
    root.left = Node(6) 
    root.right = Node(15) 
  
    print("Original BST") 
    printInorder(root)
    print()
    addSmaller(root) 
  
    print("BST To Binary Tree") 
    printInorder(root) 
  