package com.prop.operations;

import java.util.Scanner;

import com.prep.Stack.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter size of Stack");
		Scanner sc=new Scanner(System.in);
		int sizeOfStack=sc.nextInt();
		Stack stack=new Stack(sizeOfStack);
		System.out.println("Enter "+sizeOfStack+" data to add");
		for (int i = 0; i < sizeOfStack; i++) {
			stack.push(sc.nextInt());	
		}
		System.out.println("All Data pushed.");
		
		System.out.println("Add one more data for overflow");stack.push(sc.nextInt());
		
		stack.pop();
		
	}

}
