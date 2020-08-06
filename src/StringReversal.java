// Exercise 4
import java.util.Scanner;
public class StringReversal 
{

	public static void main(String[] args) 
	{
		//Declare string variables
		String inputString;
		
		//User to enter the input String
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		inputString = scan.nextLine();
		scan.close();
	
		//Print out the reversed string
		System.out.print("The reversed string is: " + reverseString(inputString));
	}
	public static String reverseString(String s)
	{
		if(s.length() == 0)
			return s;
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}
