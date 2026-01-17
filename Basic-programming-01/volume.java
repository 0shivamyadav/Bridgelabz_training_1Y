import java.util.Scanner;
class volume
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter radius of earth in km");
		double radius=sy.nextInt();
		double vol= (4/3)*3.14*radius*radius*radius;
		double volmiles=vol*0.621;
		System.out.print("vol of earth in km "+ vol);
		System.out.print("vol of earth in miles "+ volmiles);
	}
}