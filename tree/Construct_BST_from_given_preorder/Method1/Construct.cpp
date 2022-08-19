#include <iostream> 

using namespace std ; 
class node {
    public:
        int data ; 
        node* left ; 
        node* right ; 
}; 

node* newNode(int data) {
    node* temp = new node() ; 
    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ; 

    return temp ; 
}

node* constructTreeUtil (int pre [], int* preIndex, int low, int high, int size) {
    if (*preIndex > size || low > high){
        return NULL ; 
    }

    node* root = newNode(pre[*preIndex]) ; 
    *preIndex = *preIndex + 1 ; 

    if (low == high){
        return root ; 
    }

    int i ; 
    for (i = low ; i <= high ; i++) {
        if(root->data < pre[i]){
            break ; 
        }
    }

    root->left = constructTreeUtil(pre, preIndex, *preIndex, i-1, size) ;

    root->right = constructTreeUtil(pre, preIndex, i, high, size) ; 

    return root ; 
}

node* constructTree(int pre[], int size){
    int preindex = 0 ; 
    return constructTreeUtil(pre, &preindex, 0, size - 1 , size) ; 
}

void printInorder(node* root) {
    if(root == NULL){
        return ; 
    }
    printInorder(root->left) ; 
    cout<<root->data<<" " ; 
    printInorder(root->right) ; 
}

int main () {
    int pre[] = {10, 5, 1, 7, 40, 50} ; 
    int size = sizeof(pre)/sizeof(pre[0]) ; 

    node* root = constructTree(pre, size) ; 
    cout<<"In_order traversal of the construted tree : "<<endl ; 
    printInorder(root) ; 

    cout<<endl ; 
    return 0 ; 
}


