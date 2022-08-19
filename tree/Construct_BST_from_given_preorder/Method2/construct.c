#include <limits.h> 
#include <stdio.h> 
#include <stdlib.h> 

struct node {
    int data ; 
    struct node* right ; 
    struct node* left ; 
}; 

struct node* newNode(int data) {
    struct node* temp = (struct node*)malloc(sizeof(struct node)) ; 

    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ;

    return temp ;  
}

void printInorder(struct node* node){
    if(node == NULL){
        return ; 
    }
    printInorder(node->left); 
    printf(" %d ", node->data) ; 
    printInorder(node->right) ; 
}

struct node* constructTreeUtil(int pre[], int* preIndex, int key, int min, int max, int size){
    if(*preIndex > size){
        return NULL ; 
    }
    struct node* root = NULL ; 
    if(key < max && key > min){
        root = newNode(pre[*preIndex]) ; 
        *preIndex = *preIndex + 1 ; 
        if (*preIndex < size){
            root->left = constructTreeUtil(pre,preIndex,pre[*preIndex],min,key,size) ; 
        }

        if(*preIndex < size){
            root->right = constructTreeUtil(pre,preIndex,pre[*preIndex],key,max,size) ; 
        }
    }

    return root ; 
}

struct node* constructTree(int pre[], int size){
    int preIndex = 0 ; 
    return constructTreeUtil(pre,&preIndex,pre[0],INT_MIN,INT_MAX,size) ; 
}

int main() {
    int pre [] = {10,5,1,7,40,50} ; 
    int size = sizeof(pre)/sizeof(pre[0]) ; 

    struct node* root = constructTree(pre,size) ; 
    printf("In_order traversal of the constructed tree : ") ; 
    printInorder(root) ; 
    
}