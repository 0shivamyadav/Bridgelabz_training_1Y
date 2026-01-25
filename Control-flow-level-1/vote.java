import java.util.Scanner;
public class loop
{
	public static void main (String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter age of  person: ");
		int a=sy.nextInt();
		if(a>=18)
		{
			System.out.print("person is eligible of vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}

	}
}	