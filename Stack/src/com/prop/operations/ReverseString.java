package com.prop.operations;

import java.util.Scanner;

import com.prep.Stack.Stack;
import com.prep.Stack.StackString;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scanner=new Scanner(System.in);
		String originalString=scanner.next();
		StackString stack=new StackString(originalString.length());
		char[] stringChar=originalString.toCharArray();
		for (int i = 0; i < originalString.length(); i++) {
			stack.push(stringChar[i]+"");
		}
		
		for (int i = 0; i < originalString.length(); i++) {
			stack.pop();
		}
	}
}
