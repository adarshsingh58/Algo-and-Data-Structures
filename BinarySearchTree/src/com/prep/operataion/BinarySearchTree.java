package com.prep.operataion;

import com.prep.main.Node;

public class BinarySearchTree {

	public static void main(String[] args) {
		Node binarySearchTree = setUpBST();
		
		//binarySearchTree.add(90);
		
		/*Node dataOonNOde=binarySearchTree.search(40);
		if(dataOonNOde!=null)
		System.out.println(dataOonNOde.data+" found");
		else
			System.out.println("not found");
		*/
		
		//binarySearchTree.isBST();
		
		//binarySearchTree.delete(1);
		
		//LCA
//		System.out.println(binarySearchTree.getLCA(30,60));
	}

	private static Node setUpBST() {
		Node binarySearchTree=new Node(50);
		binarySearchTree.left=new Node(40);
		binarySearchTree.right=new Node(60);
		binarySearchTree.left.left=new Node(30);
		binarySearchTree.left.right=new Node(45);
		binarySearchTree.right.left=new Node(55);
		binarySearchTree.right.right=new Node(65);
		return binarySearchTree;
	}

}
