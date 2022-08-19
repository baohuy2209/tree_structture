#include <iostream> 

using namespace std ; 
class Node{
    public : 
        int data ; 
        Node* right ; 
        Node* left ;

        Node(int data){
            this->data = data ; 
            this->right = NULL ; 
            this->left = NULL ; 
        }
}; 

Node* newNode(int data){
    Node *node = new Node(data); 
    return node ; 
}

Node* insert(Node* root, int data){
    if(root == NULL){
        return newNode(data) ; 
    }
    if(data > root->data){
        root->right = insert(root->right, data) ; 
    }
    if(data < root->data){
        root->left = insert(root->left, data) ; 
    }

    return root ; 
}

void inorder(Node* root){
    if(root == NULL){
        return ; 
    }
    inorder(root->left); 
    cout<<root->data<<" " ; 
    inorder(root->right) ; 
}

int main(){
    Node* root = new Node(10) ; 
    root = insert(root, 5) ; 
    root = insert(root, 1) ; 
    root = insert(root, 40) ; 
    root = insert(root, 50) ; 

    inorder(root) ; 
    return 0; 
}