import java.util.Scanner;
class trianglearea
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter base of triangle");
		double base=sy.nextDouble();
		System.out.print("enter height of triangle");
		double height =sy.nextDouble();
		double area=(1/2)*base*height;
		System.out.print("area of triangle is"+ area);
		
	}
}