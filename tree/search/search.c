#include <stdio.h> 
#include <stdlib.h>

struct node {
    int data; 
    struct node* right ; 
    struct node* left ; 
}; 

struct node* newNode(int data) {
    struct node* temp = (struct node*) malloc(sizeof(struct node)) ; 

    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ; 

    return temp;
}

struct node* insert(struct node* root, int data) {
    if(root == NULL){
        return newNode(data) ; 
    }

    if(root->data > data){
        root->left = insert(root->left, data); 
    }
    if(root->data < data){
        root->right = insert(root->right, data); 
    }

    return root; 
}

struct node* search(struct node* root, int data){
    if(root == NULL || root->data == data){
        return root ; 
    }

    if(root->data < data){
        return search(root->right, data) ; 
    }
    return search(root->left, data) ; 
}

int main(){
    struct node* root = malloc(sizeof(struct node)); 

    root = insert(root, 10) ; 
    root = insert(root, 5) ; 
    root = insert(root, 1) ; 
    root = insert(root, 7) ; 
    root = insert(root, 40) ;
    root = insert(root, 50) ;

    printf("%d",search(root, 40)) ; 

    return 0 ; 
}