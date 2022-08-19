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
    temp->right = NULL ; 
    temp->left = NULL ; 

    return temp ; 
}

void printInorder(struct node* root){
    if(root == NULL){
        return ; 
    }

    printInorder(root->left);
    printf(" %d ", root->data) ; 
    printInorder(root->right); 
}

struct node* constructTreeUtil(int pre[], int *preIndex, int low, int high, int size){
    if(*preIndex > size || low > high){
        return NULL ; 
    }

    struct node* root = newNode(pre[*preIndex]) ; 
    *preIndex = *preIndex + 1 ; 

    if(low == high){
        return root ; 
    }

    int i ; 
    for(i = low; i <= high; ++i){
        if(root->data < pre[i]){
            break ; 
        }
    }

    root->left = constructTreeUtil(pre, preIndex, *preIndex, i-1 , size) ;
    root->right = constructTreeUtil(pre, preIndex, i, high, size) ;  

    return root ; 
}

struct node* constructTree(int pre[], int size){
    int preIndex = 0 ; 
    return constructTreeUtil(pre, &preIndex, 0, size-1, size ) ; 
}

int main() {
    int pre[] = {10, 5, 1, 7, 40, 50, 30, 25, 80, 8} ; 
    int size = sizeof(pre)/sizeof(pre[0]); 
    struct node* root = constructTree(pre, size) ; 
    printf("In_order traversal of the constructed tree : ") ; 
    printInorder(root) ; 

    printf("\n"); 

    return 0 ; 
}

