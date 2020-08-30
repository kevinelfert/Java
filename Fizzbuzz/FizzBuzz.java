/**
 * @author Kevin Elfert
 * @since 7/30/2020
 */
import java.util.Scanner;
public class FizzBuzz
{
	public static void main(String[] args)
 	{
		Scanner input = new Scanner(System.in);
		int numberOfCases = input.nextInt();
		for (int i = 0;i<numberOfCases;i++) 
		{
			int fizzBuzz = input.nextInt();
			if (fizzBuzz%3==0 && fizzBuzz%5==0) 
			{
				System.out.println("fizzbuzz");
			}
			else if(fizzBuzz%3==0)
			{
				System.out.println("fizz");
			}
			else if (fizzBuzz%5==0) 
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(fizzBuzz);
			}
		} 
		input.close();
	}
}