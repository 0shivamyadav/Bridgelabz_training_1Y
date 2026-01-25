import java.util.*;
public class factor	 
{
	public static void main(String[] args)
	{
		Scanner sy=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a=sy.nextInt();
		System.out.print("Enter power of the no: ");
		int b=sy.nextInt();
		int p=1;
		for(int i=1;i<=b;i++)
		{
			p=p*a;
		}
		System.out.print(+p);
			
			
	}
}