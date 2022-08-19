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

void TransformTree(Node* node, int* sum){
    if(node == NULL){
        return ; 
    }

    TransformTree(node->right, sum) ; 
    *sum = *sum + node->data ; 
    node->data = *sum - node->data ; 
    TransformTree(node->left, sum) ; 
}

void printPreorder(Node* node){
    if(node == NULL){
        return ; 
    }
    cout<<node->data<<" " ; 
    printPreorder(node->left) ; 
    printPreorder(node->right) ; 
}

Node* insert(Node* node, int data) {
    if(node == NULL){
        return new Node(data) ; 
    }

    if(node->data > data){
        node->left = insert(node->left, data) ; 
    }

    if(node->data < data){
        node->right = insert(node->right, data) ; 
    }

    return node ; 
}

void create(Node* node, int arr[], int length){
    for(int i = 0 ; i < length ; i++){
        node = insert(node, arr[i]) ; 
    }
}

int main(){
    int arr[] = {5,1,7,40,50} ; 
    int size = sizeof(arr)/sizeof(arr[0]) ; 

    Node* node = new Node(10) ; 

    create(node, arr, size) ; 

    int sum = 0 ; 
    TransformTree(node, &sum) ;
    printPreorder(node) ; 
    return 0 ;  
}
