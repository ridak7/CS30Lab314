import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import 

public class FindAndReplace {

	public static void main(String[] args) 
	{
		
		File textFile;
		File newFile;
		String fileName, searchText, replaceText;
		Scanner input = new Scanner(System.in);
		FileReader in;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		String lineOfText;

		/* prompt user for file name, search text, and replace text */
		System.out.print("Enter the name of the file: ");
		fileName = input.nextLine();
		textFile = new File(fileName);
		System.out.print("Enter the search text: ");
		searchText = input.nextLine();
		System.out.print("Enter the replace text: ");
		replaceText = input.nextLine();

		/* read each line of text from the file, make replacement, and write line to new file */
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			fileName = fileName.replace(".", "NEW.");	//create a file name for the new file
			newFile = new File(fileName);
			out = new FileWriter(newFile);
			writeFile = new BufferedWriter(out);
    		while ((lineOfText = readFile.readLine()) != null) {
    			lineOfText = lineOfText.replaceAll(searchText, replaceText);
				writeFile.write(lineOfText);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			readFile.close();
    		in.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
	}
		
	}

}
