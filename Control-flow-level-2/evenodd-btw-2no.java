import java.util.*;
public class fact
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter first no: ");
		int a=sy.nextInt();
		System.out.print("Enter second no: ");
		int b=sy.nextInt();
		for(;a<=b;a++)
		{
			if(a%2==0)
			{
				System.out.println("even no. is "+a);
			}	
			else
			{
				System.out.println("odd no. is " +a);
			}
		}
	}
}