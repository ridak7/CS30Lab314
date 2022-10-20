
import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class StatsP1 
{

	public static void main(String[] args) 
	{
		File dataFile = new File("C:\\Users\\amabdalla\\OneDrive - Calgary Board of Education\\Desktop\\HelloWorld\\test1.txt");
		FileReader in;
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		BufferedReader readFile;
		String stuName, score;
		
		double lowScore = 100;
		double highScore = 0;
		
		double avgScore;
		double scoreValue;
		double totalScores = 0;
		
		int numScores = 0;
		
		
		try
		{
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
				
			}//ends the while loop
			
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
			System.out.println("Problem reading file. ");
			System.err.print("IOException: " + e.getMessage());
		}
	}

}
