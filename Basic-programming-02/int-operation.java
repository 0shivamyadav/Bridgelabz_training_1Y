import java.util.Scanner;
class average
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter first no. ");
		int a=sy.nextInt();
		System.out.println("enter second no. ");
		int b=sy.nextInt();
		System.out.println("enter third no. ");
		int c=sy.nextInt();
		int op1=a+(b*c);
		int op2=(a*b)+c;
		int op3=c+(a/b);
		int op4=(a%b)+c;
		System.out.println("result of first operation is " + op1);
		System.out.println("result of second operation is " + op2);
		System.out.println("result of third operation is " + op3);
		System.out.println("result of fouth operation is " + op4);	
	}
}