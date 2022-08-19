#include <iostream> 

using namespace std ; 

struct node {
    int data ; 
    struct node* left ; 
    struct node* right ; 
}; 

void storeInorder(struct node* node, int inorder[], int* index_ptr){
    if (node == NULL){
        return ;
    }

    storeInorder(node->left, inorder, index_ptr) ; 

    inorder[*index_ptr] = node->data ; 
    *index_ptr = *index_ptr +1 ; 

    storeInorder(node->right, inorder, index_ptr) ; 
}

int countNodes(struct node* root) {
    if(root == NULL){
        return 0 ; 
    }

    return countNodes(root->right) + countNodes(root->left) + 1 ; 
}

int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b) ; 
}

void arrayToBST(int* arr, struct node* root, int* index_ptr){
    if(root == NULL){
        return ; 
    }

    arrayToBST(arr, root->left, index_ptr);
    root->data = arr[*index_ptr];
    *index_ptr = *index_ptr + 1 ; 

    arrayToBST(arr, root->right, index_ptr);
}

void binaryTreeToBST(struct node* root){
    if(root == NULL){
        return ;
    }

    int n = countNodes(root) ; 

    int* arr = new int[n];

    int i = 0 ; 
    storeInorder(root, arr, &i) ; 
    qsort(arr, n, sizeof(arr[0]),compare) ; 

    i = 0 ; 
    arrayToBST(arr,root, &i) ; 
    delete[] arr ; 
}

void printInorder(struct node* root){
    if(root == NULL){
        return ; 
    }

    printInorder(root->left) ; 
    cout<<root->data<<" " ; 
    printInorder(root->right) ; 
}

struct node* newNode(int data){
    struct node* temp = new struct node ; 
    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ; 

    return temp ; 
}

int main() {
    struct node* root = NULL ; 
    root = newNode(10) ; 
    root->left = newNode(30) ; 
    root->right = newNode(15) ; 
    root->left->left = newNode(20) ; 
    root->right->right = newNode(5) ; 

    binaryTreeToBST(root);

    cout<<"Inorder traversal of the converted tree : "<<endl ;  
    printInorder(root) ; 

    return 0 ; 
}