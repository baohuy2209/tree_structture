#include <iostream> 
using namespace std; 

class Node{
    public:
        int data ; 
        Node* left ; 
        Node* right ; 

        Node(int data){
            this->data = data ; 
            this->left = NULL ; 
            this->right = NULL ;
        }

};

void convertTree(Node* node, int* sum){
    if(node == NULL){
        return ; 
    }

    convertTree(node->left, sum); 
    *sum = *sum + node->data ; 
    node->data = *sum ; 
    convertTree(node->right, sum);
}
void printInorder(Node* node){
    if (node == NULL){
        return ; 
    }

    printInorder(node->left) ; 
    cout<<node->data<<" " ; 
    printInorder(node->right) ; 

}

int main(){
    Node* root = new Node(5) ; 
    root->right = new Node(13) ; 
    root->left = new Node(2) ; 

    int sum = 0 ; 
    convertTree(root, &sum) ;

    cout<<"Inorder traversal of converted tree : ";  
    printInorder(root) ; 

    return 0 ; 
}