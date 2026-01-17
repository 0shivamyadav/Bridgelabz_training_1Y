import java.util.Scanner;
class alloperation
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter first no.");
		float a=sy.nextFloat();
		System.out.println("enter second no.");
		float b=sy.nextFloat();
		//System.out.println("enter marks of chemistry");
		//int che=sy.nextInt();
		float addition=a+b;
		System.out.println
		("addition of two no.: " + addition);
		float substraction=a-b;
		System.out.println("substraction of two no.: " + substraction);
		float multiplication=a*b;
		System.out.println("multiplication of two no.: " + multiplication);
	    float division=a/b;;
		System.out.println("division of two no.: " + division);
	}
}