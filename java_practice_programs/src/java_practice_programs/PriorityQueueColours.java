package java_practice_programs;

import java.util.PriorityQueue;

public class PriorityQueueColours {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Blue");
		queue.add("Cyan");
		queue.add("Pink");
		queue.add("Yellow");
		queue.add("Purple");
		System.out.println("Priority Queue: ");
		System.out.println(queue);

	}
}
