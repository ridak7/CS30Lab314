/**
 * Queue2 class
 */
public class Queue2 {
	private Object[] data;
	private int front, rear, maxSize;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: An empty queue that can hold up to maxItems has been created.
	 */
	public Queue2(int maxItems) {
		data = new Object[maxItems];
		front = -1;		//no items in the array
		rear = -1;
		maxSize = maxItems;
	}

	
	/** 
	 * Returns the front item without removing it from the queue.
	 * pre: Queue contains at least one item.
	 * post: The front item has been returned while leaving it in the queue.
	 */
	public Object front() {
	 	return(data[front]);
	}
	
	
	/** 
	 * Removes the front item from the queue and returns it.
	 * pre: Queue contains at least one item.
	 * post: The front item of the queue has been removed and returned.
	 */
	public Object dequeue() {
		Object item;
		
		item = data[front];						//get front item
		if (front == rear) {					//if dequeueing last item then make empty
			makeEmpty();
		} else {
			front = (front + 1) % maxSize;		//move pointer to next item
		}
	  	return(item);							//return front item
	}
	

	/** 
	 * Adds an item to the queue if there is room.
	 * pre: queue is not full
	 * post: A new item has been added to the queue.
	 */
	public void enqueue(Object item) {
	 	if (isEmpty()) {		//first item queued
	 		rear = 0;
	 		front = 0;
	 		data[rear] = item;
	 	} else {
	 		rear = (rear + 1) % maxSize;
	 		data[rear] = item;
	 	}
	}


	/** 
	 * Determines if there are items on the queue.
	 * pre: none
	 * post: true returned if there are items on the queue,
	 * false returned otherwise.
	 */
	public boolean isEmpty() {
	 	if (front == -1 && rear == -1) {
	 		return(true);
	 	} else {
	 		return(false);
	 	}
	}

	
	/** 
	 * Returns the number of items in the queue.
	 * pre: none
	 * post: The number of items in the queue has been returned.
	 */
	public int size() {
	 	if (isEmpty()) {
	 		return(0);
	 	} else {
	 		if (rear > front) {					//front item is "in front" of rear item
	 			return(rear - front + 1);
	 		} else if (front == rear + 1) {		//queue is full
	 			return(maxSize);
	 		} else {
	 			return(front - rear + 1);		//front item is "behind" rear item
	 		}
	 	}
	}


	/** 
	 * Empties the queue.
	 * pre: none
	 * post: There are no items in the queue.
	 */
	public void makeEmpty() {
	 	front = -1;
	 	rear = -1;
	}
}