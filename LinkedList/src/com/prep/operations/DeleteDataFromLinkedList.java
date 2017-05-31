package com.prep.operations;

import com.prep.DataStructure.Node;

public class DeleteDataFromLinkedList {

	public static void deleteByKey(Node head, int index) {

		 if (index == head.size()) {
			for (int i = 0; i < index - 2; i++) {
				head = head.next;
			}
			head.next = null;
		} else {
			Node prev = head;
			head = head.next;
			for (int i = 0; i < index - 1; i++) {
				prev = prev.next;
				head = head.next;
			}
			prev.next = head.next;
			head.next = null;
		}
	}

	public static void deleteByData(Node head, int data) {

	}

	public static Node deleteFirstRecord(Node head) {

			Node node=new Node();
			node.data=head.next.data;
			node.next=head.next.next;
			head=null;
			return node;
			
	}
}
