import java.util.Scanner;
public class loops
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("enter month :");
		int a =sy.nextInt();
		System.out.print("enter date :");
		int b=sy.nextInt();
		if((a==3 && b>=20) || a==4 || a==5 || (a==6 && b<=20))
		{
			System.out.print("Spring season");
		}
		else
		{
			System.out.println("Not spring season");
		}
	}
}