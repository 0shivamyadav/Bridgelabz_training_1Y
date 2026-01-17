import java.util.Scanner;
class convert12
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("distance in feets is");
		double feets=sy.nextDouble();
		//System.out.print("enter height of triangle");
		//double height =sy.nextDouble();
		double yard=3*feets;
		System.out.println("distance in yard " + yard);
		double miles = 1760*yard;
		System.out.println("distance in miles " + miles);
		
	}
}