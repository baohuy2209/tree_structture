class node:
    def __init__(self,data):
        self.data = data 
        self.left = None 
        self.right = None 

class BST:
    def __init__(self,root):
        self.root = root 

    def insert(self, node, data):
        if(node is None):
            return node(data)

        if(node.data > data):
            node.left = self.insert(node.left, data)

        if(node.data < data):
            node.right = self.insert(node.right, data)

        return node 

    def search(self,node, data):
        if(node is None or node.data == data) :
            return node 

        if(node.data > data) :
            return self.search(node.left, data)

        return self.search(node.right, data) 

    def printInorder(self):
        self.inorder(self.root)

    def inorder(self, node):
        if node is None:
            return 
        self.inorder(node.left)
        print(node.data, " ")
        self.inorder(node.right)

if __name__ == "__main__":
    node = node(10)
    tree = BST(node) 

    tree = tree.insert(node, 5)
    tree = tree.insert(node, 1)
    tree = tree.insert(node, 7)
    tree = tree.insert(node, 40)
    tree = tree.insert(node, 50)

    print("Inorder traversal of tree : ")
    tree.printInorder() 

    if(tree.search(node,50) is not None):
        print("Found !!!")
    else: 
        print("Not Found !!!") 

    print("\n") 


