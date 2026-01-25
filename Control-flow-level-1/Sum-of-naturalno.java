import java.util.Scanner;
public class loops
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("enter a natural no :");
		int a =sy.nextInt();
		double b=a*(a+1)/2;
		System.out.print("sum of n natural no. is " + b);
	}
}