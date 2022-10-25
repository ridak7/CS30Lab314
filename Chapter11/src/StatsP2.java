import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class StatsP2 
{

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		FileWriter out;
		
		BufferedReader readFile;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName, stuName, score;
		
		int numStu, numScores = 0;
		
		double scoreValue, avgScore;
		double lowScore = 100;
		double highScore = 0;
		double totalScores = 0;
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		
		//Write data to file
		System.out.print("Enter the file name for stroing names and grades: ");
		fileName = input.nextLine();
		
		System.out.print("How many students? ");
		numStu = input.nextInt();
		
		try //Writing data to file 
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i=0; i<numStu; i++)
			{
				System.out.print("Enter student name: ");
				stuName = input.next();
				
				System.out.print("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
			}//Ends the for loop

			writeFile.close();
			out.close();
			System.out.print("Data written to file.");			
		}
		catch(IOException e)
		{
			System.out.println("Problem writing to file. ");
			System.err.print("IOException: " + e.getMessage());
		}
		
		try//Reading data from file and process the data
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((stuName = readFile.readLine()) != null)
			{
				score = readFile.readLine();
				System.out.println(stuName + " "+ score);
				numScores += 1;
				scoreValue = Double.parseDouble(score);
				totalScores += scoreValue;
				
				if(scoreValue < lowScore)//check for low score
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)//check for high score
				{
					highScore = scoreValue;
				}
			}//while loop closes
			avgScore = totalScores/numScores;
			System.out.println("Low score = "+ nf.format(lowScore/100));
			System.out.println("High score = "+ nf.format(highScore/100));
			System.out.println("Average = "+ nf.format(avgScore/100));
		
			readFile.close();	
			in.close();
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
		
		


	}

}
