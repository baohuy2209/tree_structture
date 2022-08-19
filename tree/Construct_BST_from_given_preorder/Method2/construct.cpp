#include <bits/stdc++.h> 
using namespace std ; 

class Node{
    public:
        int data ;
        Node* right ; 
        Node* left ; 
}; 

Node* newNode(int data){
    Node* temp = new Node() ; 

    temp->data = data ; 
    temp->right = NULL ; 
    temp->left = NULL ; 

    return temp ; 
}

void printInorder(Node* node){
    if(node == NULL){
        return ; 
    }
    printInorder(node->left) ; 
    cout<<node->data<<" " ; 
    printInorder(node->right) ; 
}

Node* constructTreeUtil(int pre[], int* preIndex, int key, int min, int max, int size){
    if(*preIndex > size){
        return NULL ;
    }
    Node* root = NULL ; 
    if(key < max && key > min){
        root = newNode(key) ; 
        *preIndex = *preIndex + 1 ;

        if(*preIndex < size){
            root->left = constructTreeUtil(pre,preIndex, pre[*preIndex],min,key,size) ; 
        }

        if(*preIndex < size){
            root->right = constructTreeUtil(pre,preIndex,pre[*preIndex],key, max, size) ; 
        }
    }

    return root ; 
}

Node* constructTree(int pre[],int size){
    int preIndex = 0 ; 
    return constructTreeUtil(pre,&preIndex,pre[0],INT_MIN,INT_MAX,size) ; 
}

int main() {
    int pre[] = {10,5,1,7,40,50} ; 
    int size = sizeof(pre)/sizeof(pre[0]); 

    Node* root = constructTree(pre,size) ; 
    cout<<"In_order traversal of the constructed tree : "<<endl;
    printInorder(root) ; 

    cout<<"\n" ; 
    return 0 ; 
}