import java.util.Scanner;
public class fact
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		
	    int a,fact=1,d;
		a=sy.nextInt();
		for (int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +a+ " is " + fact);
	}
}