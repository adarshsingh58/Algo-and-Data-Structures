package com.prop.operations;

import com.prep.Stack.TwoStackInAnArray;

public class MainTwoStackArray {

	public static void main(String[] args) {
		TwoStackInAnArray twoStackInAnArray=new TwoStackInAnArray(10);
		twoStackInAnArray.pushStack1(1);
		twoStackInAnArray.pushStack1(2);
		twoStackInAnArray.pushStack1(3);
		twoStackInAnArray.pushStack1(4);
		twoStackInAnArray.pushStack1(5);
		
		
		twoStackInAnArray.pushStack2(10);
		twoStackInAnArray.pushStack2(9);
		twoStackInAnArray.pushStack2(8);
		twoStackInAnArray.pushStack2(7);
		twoStackInAnArray.pushStack2(6);
		
		twoStackInAnArray.popStack2();
		twoStackInAnArray.popStack1();
		twoStackInAnArray.printWholeStack();
	}

}
