class node:
    def __init__(self, key):
        self.data = key 
        self.left = None 
        self.right = None 

def insert(root, key):
    if root is None:
        return node(key)

    else:
        if root.data == key:
            return root 
        elif root.data < key:
            root.right = insert(root.right, key) 
        else: 
            root.left = insert(root.left, key)

    return root 

def inorder(root):
    if root :
        inorder(root.left) 
        print(root.data," ")
        inorder(root.right)

r = node(50) 
r = insert(r, 30)
r = insert(r, 20)
r = insert(r, 40)
r = insert(r, 70)
r = insert(r, 60)
r = insert(r, 80)
inorder(r) 


