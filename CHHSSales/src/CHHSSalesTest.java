import java.text.NumberFormat;
import java.util.Scanner;

public class CHHSSalesTest 
{
	
	public static void payEmployee(Employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		
		System.out.println(money.format(pay));
	}
	
	
	public static void main(String[] args) 
	{
		Manager emp1 = new Manager("John", "Smith", 50000);
		Associate emp2 = new Associate("Lou", "Raymond", 16.00);
		
		Scanner userinput = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		Employee emp = emp1;
		
		do
		{
			System.out.println("\n Employee \\ Pay \\ Quit ");
			System.out.println("Enter choice: ");
			action = userinput.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Employee number(1, or 2): ");
				empNum = userinput.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
				}
				if(action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter the hours for Associate or pay period for Manager");
					payArg = userinput.nextDouble();
					
					payEmployee(emp,payArg);
				}
				
			}
		}while(!action.equalsIgnoreCase("Q"));//end of the do loop

	}

}
