import java.util.Scanner;
public class loop
{
	public static void main (String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int a=sy.nextInt();
		if(a>0)
		{
			System.out.print(a +" is a positive no.");
		}
		else if(a<0)
		{
			System.out.println(a +" is a negative no.");
		}
		//else if(a==0)
		//{
		//	System.out.println("this is a zero no.")
		//}

	}
}	