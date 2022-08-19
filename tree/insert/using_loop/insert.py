class GFG:
    @staticmethod
    def main():
        r = Node(120)
        insert(r, 50)
        insert(r, 20)
        insert(r, 30)
        insert(r, 60)
        insert(r, 40)
        insert(r, 60)
        insert(r, 70)
        insert(r, 100)
        insert(r, 200)

        inorder(r)

class Node:
    left = None 
    right = None 
    data = 0 
    def __init__(self,data):
        self.data = data 

def insert(root, key):
    node = Node(key)

    if root is None:
        root = node 
        return 

    prev = None 
    temp = root 

    while temp is not None :
        if temp.data > key:
            prev = temp 
            temp = temp.left 
        if temp.data < key:
            prev = temp 
            temp = temp.right 
        
    if prev.data > key:
        prev.left = key 
    if prev.data < key:
        prev.right = key 

def inorder(root):
    temp = root
    stack = [] 
    while temp is not None:
        if temp != None:
            stack.append(temp)
            temp = temp.left 
        else:
            temp = stack.pop()
            print(temp.data," ")
            temp = temp.right 

if __name__ == "__main__":
    gfg = GFG()
    gfg.main() 

