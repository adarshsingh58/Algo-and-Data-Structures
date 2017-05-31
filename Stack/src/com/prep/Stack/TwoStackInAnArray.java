package com.prep.Stack;

public class TwoStackInAnArray {

	
	public int[] data;
	public int top1,top2;
	public int maxSize;
	
	public TwoStackInAnArray(int maxSize) {
		this.maxSize=maxSize;
		data=new int[maxSize];
		top1=-1;
		top2=maxSize;
	}
	
	public void pushStack1(int dataValue) {
		if((top1+1)==top2 || top1==maxSize-1)
		{
			System.out.println("Overflow");
		}else{
			top1++;
			data[top1]=dataValue;
		}
	}
	public void pushStack2(int dataValue) {
		if((top2-1)==top1 || top2==0)
		{
			System.out.println("Overflow");
		}else{
			top2--;
			data[top2]=dataValue;
		}
	}

	public void popStack1(){
		if(top1==-1)
		{
			System.out.println("UnderFlow");
		}else{
			System.out.println("Popped Data: "+data[top1]);
			top1--;
		}
		
	}
	public void popStack2(){
		if(top2==maxSize)
		{
			System.out.println("UnderFlow");
		}else{
			System.out.println("Popped Data: "+data[top2]);
			top2++;
		}
		
	}

	public void printWholeStack()
{
	for (int i = 0; i <=top1; i++) {
		System.out.println(data[i]);
	}
	for (int i = maxSize-1; i >=top2; i--) {
		System.out.println(data[i]);
	}
}
}
