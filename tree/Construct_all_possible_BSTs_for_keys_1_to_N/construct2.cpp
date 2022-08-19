#include <iostream> 
#include <vector> 
using namespace std; 

struct node {
    int data ; 
    struct node* right ; 
    struct node* left ; 
} ; 

struct node* newNode(int data) {
    struct node* temp = new struct node ; 
    temp->data = data ; 
    temp->left = NULL ; 
    temp->right = NULL ; 

    return temp ; 
}

void preorder(struct node* root){
    if(root == NULL){
        return ; 
    }

    cout<<root->data<<" "; 
    preorder(root->left); 
    preorder(root->right);
}


vector<struct node*> constructTree (int start, int end){
    vector<struct node*> lst ; 
    if(start > end){
        lst.push_back(NULL);
        return lst ; 
    }

    for(int i = start; i < end; i++){
        vector<struct node*> leftsubtree = constructTree(start, i-1) ; 
        vector<struct node*> rightsubtree = constructTree(i+1, end) ; 
        for(int j = 0 ; j < leftsubtree.size() ; j++){
            struct node* left = leftsubtree[j] ; 
            for(int k = 0 ; k < rightsubtree.size() ; k++){ 
                struct node* right = rightsubtree[k] ; 
                struct node* node = newNode(i) ;

                node->left = left ; 
                node->right = right ; 

                lst.push_back(node) ;  
            }
        }
    }

    return lst ; 
}

int main(){
    vector<struct node*> lst = constructTree(1, 5) ; 
    for(int i = 0 ; i < lst.size() ; i++){
        cout<<"Preorder traversal : "; 
        preorder(lst[i]);
        cout<<"\n" ; 
    }

    return 0 ; 
}
