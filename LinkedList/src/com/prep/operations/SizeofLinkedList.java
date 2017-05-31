package com.prep.operations;

import com.prep.DataStructure.Node;

public class SizeofLinkedList {

	public static int size(Node head)
	{
		int size=0; 
		
		while(head!=null)
		{
			head=head.next;
			size++;
		}
		return size;
		
	}
}
