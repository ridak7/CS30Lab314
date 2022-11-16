
public class LinkedList 
{
	private Node head;
	
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void reove(String str)
	{
		Node current = head;
		Node previous = head;
		
		if(current.getdata().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getdata().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
			
		}
		
	}
	
	public String toString()
	{
		Node current = head;
		String listString;
		
		if(current != null)
		{			
			listString = current.getdata() + "\n";
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getdata() + "\n";			
			}
			return(listString);
		}
		else
		{
			return("There are no items in the list.");
		}
	}

}
