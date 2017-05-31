package com.prep.operations;

import com.prep.DataStructure.Node;

public class Main {

	
	public static void main(String[] args) {
		Node node=CreateLinkedList.createLinkedList();
		System.out.println(node.size());
		System.out.println("\n LinkedList:");
		PrintLinkedList.printLinkedList(node);
//		DeleteDataFromLinkedList.deleteByKey(node, 1);
		node=DeleteDataFromLinkedList.deleteFirstRecord(node);
		System.out.println("\n LinkejdList:");
		PrintLinkedList.printLinkedList(node);
	}
}
