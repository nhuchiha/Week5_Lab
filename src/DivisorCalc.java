//Exercise #3
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorCalc 
{
	private static int firstNum = 0;
	private static int secondNum = 0; 
	public static void main(String[] args) 
	{
		/*
		 * Design and implement a program that implements Euclid's algorithm for finding the greatest
			common divisor of two positive integers. The greatest common divisor is the largest integer
			that divides both values without producing a remainder. In a class called DivisorCalc,
			define a static method called gcd that accepts two integers, num1 and num2. Create a driver
			program inside the main method to test your implementation. The recursive algorithm is
			defined as follows:
			gcd(num1, num2) is num2 if num2 <= num1 and num2 divides num1
			gcd(num1, num2) is gcd(num2, num1) if num1 < num2
			gcd(num1, num2) is gcd(num2, num1%num2) otherwise

		 */
		
		Scanner scan = new Scanner(System.in);
		try
		{
		System.out.print("Please enter the first positive number: ");
		firstNum = scan.nextInt();
		System.out.print("Please enter the seccond positive number: ");
		secondNum = scan.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not an integer.");
		}
		
		System.out.println("The gcd of " + firstNum + " and " + secondNum + " is " + gcd(firstNum,secondNum));
	}
	// find gcd for two input positive integers
	public static int gcd(int num1, int num2)
	{
		if(num2 <= num1 && num1 % num2 == 0)
			return num2;
		else if (num1 < num2)
			return gcd(num2,num1);
		else 
			return gcd(num2, num1 % num2); 
	}

}
