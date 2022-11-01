import java.io.*;

public class StuName implements Serializable 
{
	private String firstName, lastName;
	
	public StuName(String fn, String ln)//create constructor method
	{
		//initialize the class variables
		firstName = fn;
		lastName = ln;
	}
	
	public String toString() //create the toString method for the class object
	{
		String stuName;
		
		stuName = firstName + " " + lastName; 
		
		return stuName;//returns the first and last name of a given student
		
	}

}
