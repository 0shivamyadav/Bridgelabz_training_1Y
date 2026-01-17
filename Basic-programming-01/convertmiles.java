import java.util.Scanner;
class convertmiles
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter kilometers");
		int km=sy.nextInt();
		double miles=km*0.621;
		System.out.print("distance in miles" +miles);
	}
}