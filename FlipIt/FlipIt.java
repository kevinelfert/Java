import java.util.Scanner;
public class FlipIt
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numberOfCases = input.nextInt();
		input.nextLine();
		for (int i = 0; i< numberOfCases; i++ ) 
		{
			String originalString = input.nextLine();
			int length = originalString.length();
			String reverseString = "";
			for (int n = 0; n<length ;n++) 
			{
				char flipIt = originalString.charAt(n);
				reverseString = flipIt + reverseString;
			}
			System.out.println(reverseString);
		}
		input.close();
	}
}