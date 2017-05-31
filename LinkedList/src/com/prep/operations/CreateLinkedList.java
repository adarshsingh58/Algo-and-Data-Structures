package com.prep.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.prep.DataStructure.Node;

public class CreateLinkedList {

	public static Node createLinkedList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers you wanna add");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		int i = 1;
		Node head = new Node(list.get(0));
		Node node = head;
		while (i < list.size()) {
			node.next = new Node(list.get(i));
			node = node.next;
			i++;
		}
		sc.close();
		
		return head;
	}

}
