import java.io.*;
import java.util.Scanner;

public class Roster 
{

	public static void main(String[] args) 
	{
		//Declaring all the variable that will be used in reading from a file
		Scanner input = new Scanner(System.in);
		File stuNameFile;
		String fileName, firstName, lastName;
		int numStudents;
		
		//Obtain file name from the user
		System.out.print("Enter the file name for the student roster: ");
		fileName = input.nextLine();
		stuNameFile = new File(fileName);
		
		System.out.print("Enter the number of students: ");
		numStudents = input.nextInt();
		
		try
		{
			//Write objects to the file
			FileOutputStream out = new FileOutputStream(stuNameFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			for(int i = 0; i < numStudents; i++)
			{
				System.out.print("Enter student first name: ");
				firstName = input.next();
				
				System.out.print("Enter student last name: ");
				lastName = input.next();
				
				writeStu.writeObject(new StuName(firstName, lastName));
			}
			writeStu.close();
			System.out.print("Dat has been written to the file.");
			
			
			//Read and display student objects
			
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exits or could not be found.");
			System.err.print("FileNotFoundException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Problem writing to file. ");
			System.err.print("IOException: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class could not be used to cast object.");
			System.err.print("ClassNotFoundException: " + e.getMessage());
		}
	}

}
