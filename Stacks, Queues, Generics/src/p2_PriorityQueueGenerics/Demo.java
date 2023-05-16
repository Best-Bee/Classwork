package p2_PriorityQueueGenerics;

import p6_Generic_PQueue.PQueue;

public class Demo {

	public static void main(String[] args) {
		PQueue pq1 = new PQueue(5);
		pq1.insert(10);
		pq1.insert(30);
		pq1.insert(50);
		pq1.insert(70);
		pq1.insert(15);
		while(!pq1.isEmpty()) {
			System.out.println(pq1.remove() + " ");
		}
	}
}
