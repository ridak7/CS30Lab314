
public abstract class Employee 
{

	private String firstName;
	private String lastName;
	
	public Employee(String fn, String ln)//Constructor method
	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString() //print Employee object
	{
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);
	
	
}
