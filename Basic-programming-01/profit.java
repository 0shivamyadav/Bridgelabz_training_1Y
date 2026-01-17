import java.util.Scanner;
class profit
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter cost price");
		int a=sy.nextInt();
		System.out.print("enter selling price");
		int b=sy.nextInt();
		profits = a-b;
		System.out.println("profit is ="+profits);
	}
}