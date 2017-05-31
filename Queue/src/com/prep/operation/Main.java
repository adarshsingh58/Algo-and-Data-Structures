package com.prep.operation;

import com.prep.queue.Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.enqueue(5);
		queue.enqueue(22);
		queue.enqueue(1);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(87);
		queue.enqueue(12);
		System.out.println(queue.dequeue());
	}
}
