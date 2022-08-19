using System;

// C# program to print BST in given range

// A binary tree node
public class Node
{

	public int data;
	public Node left, right;

	public Node(int d)
	{
		data = d;
		left = right = null;
	}
}

public class BinaryTree
{

	public static Node root;

	/* A function that constructs Balanced Binary Search Tree
	from a sorted array */
	public virtual Node sortedArrayToBST(int[] arr, int start, int end)
	{

		/* Base Case */
		if (start > end)
		{
			return null;
		}

		/* Get the middle element and make it root */
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);

		/* Recursively construct the left subtree and make it
		left child of root */
		node.left = sortedArrayToBST(arr, start, mid - 1);

		/* Recursively construct the right subtree and make it
		right child of root */
		node.right = sortedArrayToBST(arr, mid + 1, end);

		return node;
	}

	/* A utility function to print preorder traversal of BST */
	public virtual void preOrder(Node node)
	{
		if (node == null)
		{
			return;
		}
		Console.Write(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void Main(string[] args)
	{
		BinaryTree tree = new BinaryTree();
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
		int n = arr.Length;
		root = tree.sortedArrayToBST(arr, 0, n - 1);
		Console.WriteLine("Preorder traversal of constructed BST");
		tree.preOrder(root);
	}
}

// This code is contributed by Shrikant13
