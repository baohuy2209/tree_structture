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

Node* search(Node* root, int item){
    if(root == NULL || root->data == item){
        return root ; 
    }
    if(item > root->data){
        return search(root->right, item) ; 
    }
    return search(root->left, item); 
}

int main(){
    Node* root = new Node(10) ; 
    root = insert(root, 5) ; 
    root = insert(root, 1) ; 
    root = insert(root, 40) ; 
    root = insert(root, 50) ; 

    if(search(root, 50)){
        cout <<"The element 50 is in the tree"<<endl ; 
    }else{
        cout <<"Not found !!!"<<endl ; 
    }

    return 0; 
}