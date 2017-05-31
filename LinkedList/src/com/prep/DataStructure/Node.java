package com.prep.DataStructure;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data)
	{
		this.data=data;
	}
	
	public Node(Node sameNode)
	{
		this.data=sameNode.data;
		this.next=sameNode.next;
	}
	
	public Node()
	{
		
	}
	public int size()
	{
		int size=1;//One becasuse the current Node is already added as size 
		Node head=next;
		while(next!=null)
		{
			next=next.next;
			size++;
		}
		next=head;//done to not change rference of the current node objetct to last node
		return size;
		
	}

	public void add(int data)
	{
		data=this.data;
	}

}
