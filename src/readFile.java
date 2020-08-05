import java.io.*;

public class readFile 
{
	public static void main(String[] args) throws IOException
	{		
		String line ="";
		String splitBy = ",";
		int rowCount = 1;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nhuch\\Documents\\GitHub\\Week5_Lab\\input.csv"));
			
			System.out.println("Maximum Values");
			
			//Read line from the csv file
			while(((line = br.readLine()) != null))
			{
				String[] numberList = line.split(splitBy);
				
				// get the max and print it out here
				System.out.print("ROW " + rowCount + ": ");
				System.out.println(getMax(numberList));
				
				rowCount++;
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
	// Creating method to grab the maximum number in the row
	public static int getMax(String[] inputArray)
	{
		int max = 0;
		for(int j = 0; j < inputArray.length; j++)
		{
			String numStr = inputArray[j];
			numStr = numStr.replaceAll("\"", "");
			
			//convert string to integer
			int num = Integer.parseInt(numStr);
			
			//loop through and get the max
			if (num > max)
				max = num;	
		}		
		return max; 
	}
}


