import java.util.Scanner;
public class loop
{
	public static void main (String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter a no. ");
		int a = sy.nextInt();
		if(a%5==0)
		{
			System.out.print("yes no. is divisible by five");
		}
		else
		{
			System.out.println("not divisible by five");
		}
		
	}
}
