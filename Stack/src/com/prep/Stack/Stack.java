package com.prep.Stack;

public class Stack {

	int max_size;
	int[] dataStack;
	int top;
	
	public Stack(int max_size){
		this.max_size=max_size;
		dataStack=new int[max_size];
		top=-1;
	}
	
	public void push(int data)
	{
		if(top < max_size-1)
		{
			top++;
			dataStack[top]=data;
			System.out.println(data+" added in Stack");
			
		}else{
			System.out.println("Stack Overflow");
		}
		
	}

	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
		}else{
			System.out.println(dataStack[top]+" popped out of stack");
			top--;
		}
	}
}
