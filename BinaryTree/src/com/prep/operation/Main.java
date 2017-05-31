package com.prep.operation;

import com.prep.BT.Node;

public class Main {

	public static void main(String[] args) {
			
		Node binaryTree=new Node(1);
		binaryTree.right=new Node(3);
		binaryTree.left=new Node(2);
		binaryTree.left.left=new Node(4);
		
		//inorder Traversal
		System.out.println("inorder");
		inorder(binaryTree);
		//preorder Traversal
		System.out.println("preorder");
		preorder(binaryTree);
		//postorder Traversal
		System.out.println("postorder");
		postorder(binaryTree);
		
		//Breadth First Traversal / Level order traversal
		
	}

	private static void postorder(Node binaryTree) {

		if(binaryTree==null)
			return;
		postorder(binaryTree.left);
		postorder(binaryTree.right);
		System.out.println(binaryTree.data);
		
	}

	private static void preorder(Node binaryTree) {
		if(binaryTree==null)
			return;
		System.out.println(binaryTree.data);
		preorder(binaryTree.left);
		preorder(binaryTree.right);
		
	}

	private static void inorder(Node binaryTree) {
			
		if(binaryTree==null)
			return;
		
			inorder(binaryTree.left);

			System.out.println(binaryTree.data);

			inorder(binaryTree.right);
		
	}
}
