import java.util.Scanner;
class average
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter first no. ");
		double a=sy.nextDouble();
		System.out.println("enter second no. ");
		double b=sy.nextDouble();
		System.out.println("enter third no. ");
		double c=sy.nextDouble();
		double op1=a+(b*c);
		double op2=(a*b)+c;
		double op3=c+(a/b);
		double op4=(a%b)+c;
		System.out.println("result of first operation is " + op1);
		System.out.println("result of second operation is " + op2);
		System.out.println("result of third operation is " + op3);
		System.out.println("result of fouth operation is " + op4);	
	}
}