#include <stdio.h> 
#include <stdlib.h> 

struct node {
    int data ; 
    struct node* right ; 
    struct node* left ; 
}; 

struct node* newNode(int data){
    struct node* temp = (struct node*)malloc(sizeof(struct node)) ; 

    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ; 

    return temp ; 
}

void printInorder(struct node* root){
    if(root == NULL){
        return ; 
    }

    printInorder(root->left) ; 
    printf(" %d ", root->data) ; 
    printInorder(root->right) ; 
}

void printPreorder(struct node* root){
    if(root == NULL){
        return ; 
    }

    printf(" %d ", root->data) ; 
    printPreorder(root->left) ; 
    printPreorder(root->right) ; 
}

struct node* SortedArrayToBST(int pre[], int start, int end){
    if(start > end){
        return NULL; 
    }

    int mid = (start + end)/2 ;
    struct node* root = newNode(pre[mid]) ; 

    root->left = SortedArrayToBST(pre, start, mid-1) ;
    root->right = SortedArrayToBST(pre, mid+1, end) ; 

    return root ;  
}

int main() {
    int arr[] = {1,2,3,4,5,6,7,8} ; 
    int size = sizeof(arr)/sizeof(arr[0]) ;

    struct node* root = SortedArrayToBST(arr, 0, size - 1) ; 
    printf("Inorder traversal of the tree : \n") ;
    printInorder(root) ; 
    printf("\n") ; 

    printf("Preorder traversal of the tree : \n") ; 
    printPreorder(root) ; 
    printf("\n") ; 
 
    return 0 ; 
}