//Exercise #2
import java.io.*;
import java.util.Scanner;

public class userString 
{

	public static void main(String[] args) throws IOException
	{
		//Create scan object
		Scanner scan = new Scanner(System.in);
		//declare and initialize the string variable
		String inputStr ="";
		
		//Create the file
		FileWriter fw = new FileWriter("inputString.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		//Write to the file
		while (!(inputStr.equalsIgnoreCase("Done")))
		{
			System.out.print("Please enter a string: " );
			inputStr = scan.next(); 
			
			if(inputStr.equalsIgnoreCase("Done"))
				outFile.close();
			else 
			{
				outFile.print(inputStr);
				outFile.println();		
			}
		}
		System.out.println("The file has been created.");
		
		scan.close();
	}

}
