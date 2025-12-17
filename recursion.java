import java.util.Scanner;
public class recursion
{
	static int factorial(int n)
	{
		if(n <= 1)
		{
			return 1;
		}

		return n * factorial(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter Number : ");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of " + num +" is : "+fact);
	}
}
