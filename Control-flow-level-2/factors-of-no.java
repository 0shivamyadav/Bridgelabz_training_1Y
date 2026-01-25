import java.util.*;
public class factor	 
{
	public static void main(String[] args)
	{
		Scanner sy=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a=sy.nextInt();
		if(a>0)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					System.out.println("factor of the number are as :"+i);
				}
			}
		}
	}
}