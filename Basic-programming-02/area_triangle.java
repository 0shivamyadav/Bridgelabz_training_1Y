import java.util.Scanner;
class areaoftriangle
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter base of triangle in cm ");
		double base=sy.nextDouble();
		System.out.print("enter height of triangle in cm ");
		double height=sy.nextDouble();
		//System.out.println("enter marks of chemistry");
		//int che=sy.nextInt();
		double area = (.5)*base*height;
		System.out.println("area of the triangle in sq. cm " + area);
		double inch = area*0.155;
		System.out.println("area of the triangle in sq. inches " + inch);
	}
}