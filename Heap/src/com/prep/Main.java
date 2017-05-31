package com.prep;

public class Main {

	
	//Implementation for Min Heap i.e. parent always less then child
	final static int MAX_CAPACITY=10;
	static int[] heapArray;
	static int heapSize;
	
	public Main() {
		heapArray=new int[MAX_CAPACITY];
		heapSize=0;
	}
	public static void main(String[] args) {
		
		insert(10);
	}
		
	private static void insert(int i) {
		
		heapArray[heapSize]=i;
		heapSize++;
		//if parent is greater then added node 
		int parentData=(heapArray[((heapSize-1)-1)/2]);
		int childData=(heapArray[(heapSize-1)]);
		if(parentData>childData)
				{
				swap(parentData,childData);
				}
		
	}
}
