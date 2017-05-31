package com.prep.operations;

import com.prep.DataStructure.Node;

public class PrintLinkedList {

	public static void printLinkedList(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}

}
