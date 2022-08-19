#include <iostream> 
using namespace std ; 

class TNode{
    public :
        int data ; 
        TNode* left ; 
        TNode* right ; 

        TNode(int data){
            this->data = data ; 
            this->right = NULL ; 
            this->left = NULL ; 
        }
};

TNode* SortedArrayToBalancedBST(int arr[], int start, int end){
    if(start > end){
        return NULL ; 
    }

    int mid = (start+end)/2 ; 

    TNode* root = new TNode(arr[mid]) ; 
    root->left = SortedArrayToBalancedBST(arr, start, mid-1) ; 
    root->right = SortedArrayToBalancedBST(arr, mid+1, end) ; 

    return root ; 
}

void printInorder(TNode* root){
    if (root == NULL) {return ;}

    printInorder(root->left) ; 
    cout<<root->data<<" "; 
    printInorder(root->right) ; 
}

void printPreorder(TNode* root){
    if(root == NULL){ return ; }

    cout<<root->data<<" "; 
    printPreorder(root->left) ; 
    printPreorder(root->right) ; 
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7} ; 
    int size = sizeof(arr)/sizeof(arr[0]) ; 

    TNode* root = SortedArrayToBalancedBST(arr, 0, size-1);

    cout<<"Inorder traversal of the constructed balanced BST : "<<endl ; 
    printInorder(root) ; 
    cout <<"\n" ; 
    cout<<"Preorder traversal of the constructed balanced BST : "<<endl ; 
    printPreorder(root) ; 
    cout<<"\n" ; 

    return 0 ; 
}