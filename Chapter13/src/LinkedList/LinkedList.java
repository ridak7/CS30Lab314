package LinkedList;

public class LinkedList implements Stats
{
	private NodeLL head;
	
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(int num) {
		NodeLL newNode = new NodeLL(num);
		newNode.setNext(head);
		head = newNode;
	}

	
	public void remove(int num)
	{
		NodeLL current = head;
		NodeLL previous = head;
		
		if(current.getdata() == num)
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getdata() ==  num)
				{
					previous.setNext(current.getNext());
				}
			}
			
		}
		
	}
	
	public String toString()
	{
		NodeLL current = head;
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
	
	
	public int sum() 
	{
		NodeLL current = head;
		int total = 0;
		
		if (current != null) 
		{
			total += current.getdata();
			while (current.getNext() != null) 
			{
				current = current.getNext();
				total += current.getdata();
			}
		}
		return(total);
	}
	
	
	public int min() 
	{
		NodeLL current = head;
		int minValue = 0;
		
		if (current != null) 
		{
			minValue = current.getdata();
			while (current.getNext() != null) 
			{
				current = current.getNext();
				if (current.getdata() < minValue) 
				{
					minValue = current.getdata();
				}
			}
		}
		return(minValue);
	}
	
	
	public int max() 
	{
		NodeLL current = head;
		int maxValue = 0;
		
		if (current != null) 
		{
			maxValue = current.getdata();
			while (current.getNext() != null) 
			{
				current = current.getNext();
				if (current.getdata() > maxValue) 
				{
					maxValue = current.getdata();
				}
			}
		}
		return(maxValue);
	}


}
