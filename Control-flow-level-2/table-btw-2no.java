import java.util.*;
class table
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("enter first no.: ");
		int a=sy.nextInt();
		System.out.print("Enter second no: ");
		int b=sy.nextInt();
		for(;a<=b;a++)
		{
			for(int i=1;i<=10;i++)
			{
				int c=a*i;
				System.out.println(+a+" * "+i+" = "+c);
	
			}
			System.out.println(" ");
			System.out.println("table of "+a+" is :");	
			System.out.println(" ");			
		}
	}
}