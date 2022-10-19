
public class Manager extends Employee 
{
	
	private double yearlySalary;
	
	public Manager(String fn, String ln, double sal)
	{
		super(fn, ln);//from Employee Class
		yearlySalary = sal;
		
	}
	
	public double pay(double weeks)//abstract method from Employee
	{
		double payEarned;
		payEarned = yearlySalary/52*weeks;
		return payEarned;
	}
	
	public String toString() //print Manager object
	{
		return(super.toString() + ", Manager" + "Salary: " +
														yearlySalary);
	}
	
	

}
