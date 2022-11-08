
public class StackDemo 
{

	public static void main(String[] args) 
	{
		Stack2 s2 = new Stack2(10);
		
		System.out.println("Adding \"red\" and \"yellow\" to stack. ");
		s2.push("red");
		s2.push("yellow");
		System.out.println("Top of stack: "+ s2.top());
		System.out.println("Items in stack: "+ s2.size());
		s2.pop();
		System.out.println("Top of stack: "+ s2.top());
	}

}
