/*
 * Queue2Demo.java
 * Chapter 13, Queue2 review
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
 * The Queue2 data structure is tested.
 */
 public class Queue2Demo {

	public static void main(String[] args) {
		Queue2 q = new Queue2(3);

		System.out.println("Adding \"red\", \"yellow\", and \"orange\" to queue.");
		q.enqueue("red");
		q.enqueue("yellow");
		q.enqueue("orange");
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Adding \"purple\" to queue.");
		q.enqueue("purple");
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Adding \"lime\" to queue.");
		q.enqueue("lime");
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Items in queue: " + q.size());
	}
}