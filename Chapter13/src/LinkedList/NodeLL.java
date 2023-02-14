package LinkedList;

public class NodeLL 
{
	private int data;
	private NodeLL next;
	
	public NodeLL(int newData)
	{
		data = newData;
		next = null;
	}
	
	public NodeLL getNext()
	{
		return next;
	}
	
	public void setNext(NodeLL newNode)
	{
		next = newNode;
	}
	
	public int getdata()
	{
		return data;
	}
	
	
	
	

}
