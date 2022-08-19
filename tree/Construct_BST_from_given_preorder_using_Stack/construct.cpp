#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *right;
    Node *left;
} node;
class Stack
{
public:
    int top;
    int capacity;
    Node **array;
} stack;

Stack *createStack(int capacity)
{
    Stack *stack = new Stack();
    stack->top = -1;
    stack->capacity = capacity;
    stack->array = new Node *[stack->capacity * sizeof(Node *)];
    return stack;
}

Node *newNode(int data)
{
    Node *temp = new Node();

    temp->data = data;
    temp->left = NULL;
    temp->right = NULL;

    return temp;
}
int isFull(Stack *stack)
{
    return stack->top == stack->capacity - 1;
}

int isEmpty(Stack *stack)
{
    return stack->top == -1;
}

void push(Stack *stack, Node *item)
{
    if (isFull(stack))
    {
        return;
    }

    stack->array[++stack->top] == item;
}

Node *pop(Stack *stack)
{
    if (isEmpty(stack))
    {
        return NULL;
    }

    return stack->array[stack->top--];
}

Node *peek(Stack *stack)
{
    return stack->array[stack->top];
}

Node *constructTree(int pre[], int size)
{
    Stack *stack = createStack(size);

    Node *root = newNode(pre[0]);
    push(stack, root);
    int i;
    Node *temp;

    for (i = 1; i < size; i++)
    {
        temp = NULL;
        while (!isEmpty(stack) && pre[i] > peek(stack)->data)
        {
            temp = pop(stack);
        }

        if (temp != NULL)
        {
            temp->right = newNode(pre[i]);
            push(stack, temp->right);
        }
        else
        {
            peek(stack)->left = newNode(pre[i]);
            push(stack, peek(stack)->left);
        }
    }

    return root;
}

// A utility function to print inorder
// traversal of a Binary Tree
void printInorder(Node *node)
{
    if (node == NULL)
        return;
    printInorder(node->left);
    cout << node->data << " ";
    printInorder(node->right);
}

// Driver program to test above functions
int main()
{
    int pre[] = {10, 5, 1, 7, 40, 50};
    int size = sizeof(pre) / sizeof(pre[0]);

    Node *root = constructTree(pre, size);

    cout << "Inorder traversal of the constructed tree: \n";
    printInorder(root);

    return 0;
}
