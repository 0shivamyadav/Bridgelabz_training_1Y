import java.util.Scanner;
class sqside11
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter perimeter of the square");
		double perimeter=sy.nextDouble();
		//System.out.print("enter height of triangle");
		//double height =sy.nextDouble();
		double side=perimeter/4;
		System.out.print("side of the square "+ side);
		
	}
}