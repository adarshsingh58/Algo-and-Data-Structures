package com.prep.Stack;

public class StackChar {

	int max_size;
	char[] dataStack;
	int top;
	
	public StackChar(int max_size){
		this.max_size=max_size;
		dataStack=new char[max_size];
		top=-1;
	}
	
	public void push(char data)
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

	public char pop()
	{
		char poppedElement = 0;
		if(top==-1)
		{
//			System.out.println("Stack Underflow");
			System.out.println("mismatch");
			System.exit(0);
		}else{
			poppedElement=dataStack[top];
			System.out.println(poppedElement+" popped out of stack");
			top--;
		}
		return poppedElement;
	}

	public int getTop() {
		return top;
	}
	
	
}
