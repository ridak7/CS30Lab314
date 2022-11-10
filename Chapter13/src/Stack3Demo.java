
public class Stack3Demo 
{

	public static void main(String[] args) 
	{
		Stack3 s3 = new Stack3();
		System.out.println("Adding 10 and 13 to stack.");
		s3.push(10);
		s3.push(13);
		System.out.println("Top of stack: "+ s3.top());
		System.out.println("Items in stack: "+ s3.size());
		s3.pop();
		System.out.println("Top of stack: "+ s3.top());
		System.out.println("Items in stack: "+ s3.size());
		System.out.println("Adding new item");
		s3.push(45);
		s3.push(111);
		System.out.println("Top of stack: "+ s3.top());
		System.out.println("Items in stack: "+ s3.size());
	}

}
