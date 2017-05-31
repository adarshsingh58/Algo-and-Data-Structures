package com.prep.Stack;

public class StackString {

	int max_size;
	String[] dataStack;
	int top;
	
	public StackString(int max_size){
		this.max_size=max_size;
		dataStack=new String[max_size];
		top=-1;
	}
	
	public void push(String data)
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
