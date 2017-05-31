package com.prep.queue;


public class Queue {

	public Node front;
	public Node rear;
	
	public Queue(int data) {

		front=new Node(data);
		rear=front;
	}
	
	public void enqueue(int data)
	{
		Node newRear=new Node(data);
		newRear.next=rear;
		rear=newRear;
		
	}
	
	public int dequeue()
	{
		Node temp=rear;
		while(temp.next!=front)
		{
		temp=temp.next;	
		}
		temp.next=null;
		int dequeued=front.data;
		front=temp;
		
		return dequeued;
	}
	
	
	
}
