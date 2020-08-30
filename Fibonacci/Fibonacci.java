import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numberOfCases = input.nextInt();
		long fibNum;
		long fibNum1 = 1;
		long fibNum2 = 0;
		for (int i = 0;i<numberOfCases;i++) {
			fibNum = input.nextInt();
			if (fibNum == 0) {
				System.out.println("0");
			}
			else if(fibNum == 1){
				System.out.println("1");
			}
			else if (fibNum>1) {
				for (int f=1;f<fibNum;f++) {
					long result = fibNum1 + fibNum2;
					fibNum2 = fibNum1;
					fibNum1 = result;
					if ((f+1) == fibNum) {
						System.out.printf("%d\n", result);
						fibNum1 = 1;
						fibNum2 = 0;
					}
				}

			}
		}
		input.close();
	}
}