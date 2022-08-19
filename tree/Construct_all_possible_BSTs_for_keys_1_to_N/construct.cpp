#include <iostream>
#include <vector> 
using namespace std; 

class Node {
    public : 
        int data ; 
        Node* right ; 
        Node* left ; 

        Node(int data){
            this->data = data ; 
            this->left = NULL ; 
            this->right = NULL ; 
        }
} ; 
vector<Node*> constructTree(int start, int end){
    vector<Node*> lst ;
    if(start > end){
        lst.push_back(NULL);

        return lst ; 
    }

    for(int i = start; i <= end; i++){
        vector<Node*> leftsubtree = constructTree(start, i-1) ;
        vector<Node*> rightsubtree = constructTree(i+1, end) ; 
        for(int j = 0 ; j < leftsubtree.size(); j++){
            Node* left = leftsubtree[j] ; 
            for(int k = 0 ; k < rightsubtree.size(); k++){
                Node* right = rightsubtree[k] ; 
                Node* root = new Node(i) ; 
                root->left = left ; 
                root->right = right ; 

                lst.push_back(root);
            }
        } 
    }
    return lst ; 
}

void Preorder(Node* node){
    if(node == NULL){
        return ;
    }
    cout<<node->data<<" " ; 
    Preorder(node->left);
    Preorder(node->right) ; 
}

int main(){
    vector<Node*> lst = constructTree(1, 5);
    for(int i = 0 ; i < lst.size() ; i++){
        cout<<"Preorder traversal : "; 
        Preorder(lst[i]);
        cout<<"\n" ; 
    }

    return 0 ; 
}