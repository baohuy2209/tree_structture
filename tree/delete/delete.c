#include <stdio.h> 
#include <stdlib.h> 

struct node {
    int data; 
    struct node *left, *right; 
};

struct node* newNode(int data) {
    struct node* temp = (struct node*)malloc(sizeof(struct node)) ; 

    temp->data = data; 
    temp->left = temp->right = NULL ; 

    return temp ;
}

void inorder(struct node* node){
    if(node != NULL){
        return ; 
    }
    inorder(node->left) ; 
    printf("%d ",node->data); 
    inorder(node->right) ; 
}

struct node* insert(struct node* node, int data){
    if(node == NULL){
        return newNode(data); 
    }

    if(node->data < data){
        node->right = insert(node->right, data);
    }
    if(node->data > data){
        node->left = insert(node->left, data) ; 
    }

    return node; 
}
int minValue(struct node* node){
    int min = 0 ; 
    while(node != NULL){
        min = node->left->data ;
        node = node->left ;  
    }

    return min ; 
}
struct node* deleteKey(struct node* node, int data){
    if(node == NULL){
        return node; 
    }

    if(node->data > data){
        node->left = deleteKey(node->left, data) ; 
    }

    if(node->data < data){
        node->right = deleteKey(node->right, data) ; 
    }else{
        if(node->left == NULL){
            return node->right ; 
        }
        if(node->right == NULL){
            return node->left ; 
        }

        node->data = minValue(node->right) ;

        node->right = deleteKey(node->right, node->data);
    }

    return node; 
}

int main(){
    struct node* root = NULL;
    root = insert(root, 50);
    root = insert(root, 30);
    root = insert(root, 20);
    root = insert(root, 40);
    root = insert(root, 70);
    root = insert(root, 60);
    root = insert(root, 80);
  
    printf("Inorder traversal of the given tree \n");
    inorder(root);
  
    printf("\nDelete 20\n");
    root = deleteKey(root, 20);
    printf("Inorder traversal of the modified tree \n");
    inorder(root);
  
    printf("\nDelete 30\n");
    root = deleteKey(root, 30);
    printf("Inorder traversal of the modified tree \n");
    inorder(root);
  
    printf("\nDelete 50\n");
    root = deleteKey(root, 50);
    printf("Inorder traversal of the modified tree \n");
    inorder(root);
  
    return 0;
}