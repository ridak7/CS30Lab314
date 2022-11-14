
public class QueueDemo 
{

	public static void main(String[] args) 
	{
		Queue3 q = new Queue3();
		System.out.println("Adding \"red\", \"yellow\", and \"orange\" to queue.");
		q.enqueue("red");
		q.enqueue("yellow");
		q.enqueue("orange");
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + (String)q.dequeue());
		System.out.println("Front of queue: " + (String)q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Adding \"purple\" to queue.");
		q.enqueue("purple");
		System.out.println("Front of queue: " + (String)q.front());

	}

}
