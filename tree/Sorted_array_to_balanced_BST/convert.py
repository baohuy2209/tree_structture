class Node :
    def __init__(self,data):
        self.data = data
        self.right = None 
        self.left = None 

def SortedArrayToBalancedBST(arr: list[int], start: int, end: int) ->Node:
    if start > end :
        return None 
    mid = int((start + end)/2)

    root = Node(arr[mid])

    root.left = SortedArrayToBalancedBST(arr, start, mid-1) 
    root.right = SortedArrayToBalancedBST(arr, mid+1, end) 

    return root 

def printPreorder(node : Node):
    if node is None :
        return 
    print(node.data, end =" ")
    printPreorder(node.left)
    printPreorder(node.right) 

if __name__ == "__main__" : 
    arr = [1,2,3,4,5,6,7,8,9,10,11] 
    size = len(arr) 
    root = None 
    root = SortedArrayToBalancedBST(arr,0, size - 1)
    print("Preorder traversal of the tree : \n") 
    printPreorder(root) 


