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
		for (int i=1;i<=100;i++)
		{
			if (i%a==0)
			{
				System.out.println("multiple of "+a+" is :"+i);
			}
		}
		}
	}
}