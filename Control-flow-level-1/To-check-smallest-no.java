import java.util.Scanner;
public class loop
{
	public static void main (String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter 1st no. ");
		int a=sy.nextInt();
		System.out.print("Enter 2nd no. ");
		int b=sy.nextInt();
		System.out.print("Enter 3rd no. ");
		int c=sy.nextInt();
		if(a<b && a<c){
			System.out.println("smaller no is " + a);
		}
		else if(b<a && b<c)
		{
			System.out.println("smaller no. is " + b);
		}
		else if(c<a && c<b)
		{
			System.out.println("smaller no. is " + c);
		}
	}
}	