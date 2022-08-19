#include <iostream> 
using namespace std; 

class Node{
    public :
        int data;
        Node* right ; 
        Node* left ; 

        Node(int key){
            this->data = key;
            this->right = NULL ; 
            this->left = NULL ; 
        }
}; 
int compare(const void* a, const void* b){
    return (*(int*)a - *(int*)b) ; 
}

int countNodes(Node* node){
    if(node == NULL){
        return 0 ; 
    }
    return countNodes(node->left) + countNodes(node->right) + 1 ; 
}

void printInorder(Node* node){
    if(node == NULL){
        return ; 
    }

    printInorder(node->left);
    cout<<node->data<<" " ; 
    printInorder(node->right) ; 
}

void storeInorder(Node* node, int arr[], int* index_ptr){
    if(node == NULL){
        return ; 
    }

    storeInorder(node->left, arr, index_ptr); 
    arr[*index_ptr] = node->data ; 
    *index_ptr = *index_ptr + 1 ; 
    storeInorder(node->right, arr, index_ptr) ; 
}

void arrayToBST(Node* node, int arr[], int *index_ptr){
    if(node == NULL){
        return ; 
    }

    arrayToBST(node->left, arr, index_ptr); 
    node->data = arr[*index_ptr] ; 
    *index_ptr = *index_ptr + 1 ; 
    arrayToBST(node->right, arr, index_ptr);
}

void binaryToBST(Node* node){
    if(node == NULL){
        return ; 
    }

    int n = countNodes(node);
    int* arr = new int[n] ; 

    int i = 0 ; 
    storeInorder(node, arr, &i); 
    qsort(arr, n, sizeof(arr[0]), compare) ; 


    i = 0 ; 
    arrayToBST(node, arr, &i) ; 
    delete[] arr ; 
}

int main() {
    Node* root = new Node(10);
    root->left = new Node(30);
    root->right = new Node(15) ; 
    root->left->left = new Node(20) ; 
    root->left->right = new Node(1);
    root->right->right = new Node(5) ;
    root->right->right->left = new Node(4) ; 
    root->right->right->right = new Node(100) ; 
    root->right->left = new Node(25) ;  
    binaryToBST(root) ; 

    cout<<"Inorder traversal of the converted tree : "<<endl ;  
    printInorder(root) ; 

    return 0 ; 
}
