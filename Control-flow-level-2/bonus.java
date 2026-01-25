import java.util.*;
public class bonus
{
	public static void main(String []args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter ammount of salary: ");
		int a=sy.nextInt();
		System.out.print("Enter year of experience: ");
		int b=sy.nextInt();
		if(b>=5)
		{
			int c=(a/100)*5;
			System.out.print("Bonus given by the company "+c);
		}
		else
		{
			System.out.println("Bonus is 0");
		}
	}
}