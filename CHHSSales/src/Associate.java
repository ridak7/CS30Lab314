
public class Associate extends Employee 
{
	private double hourlyPayRate;
	
	public Associate(String fn, String ln, double rate)
	{
		super(fn, ln);//from Employee Class
		hourlyPayRate = rate;
	}
	
	public double pay(double hours)//abstract method from Employee
	{
		double payEarned;
		
		if(hours  > 40)
		{
		  payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5)*(hours - 40));
			
		}
		else
		{
			payEarned = hours * hourlyPayRate;
		}
		
		return payEarned;
	}
	
	public String toString() //print Associate object
	{
		return(super.toString() + ", Associate" + "Pay Rate: " +
															hourlyPayRate);
	}

}
