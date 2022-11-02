
public class myBank 
{
	private double balance;
	
	//constructor method
	
	
	//addCoins
	public void addCoins(double c)
	{
		balance = balance + c; 
		
		
	}
	
	public double giveTotal()
	{
		return balance;
	}
	
	public void removeCoins(double c)
	{
		balance = balance - c;
	}
	
	

}
