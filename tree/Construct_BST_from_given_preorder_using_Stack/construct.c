#include <stdio.h> 
#include <stdlib.h> 

typedef struct TNode {
    int data ; 
    struct TNode* right ; 
    struct TNode* left ;
} Node; 

struct StackNode{
    int top ; 
    int capacity ; 
    Node* *array ; 
} Stack ;

Stack* newStack(int capacity){

    Stack* temp = (Stack*)malloc(sizeof(Stack));

    temp->capacity = capacity; 
    temp->top = -1 ; 
    temp->array = (Node**)malloc(temp->capacity * sizeof(Node*));
}