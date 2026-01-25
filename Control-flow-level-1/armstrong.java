import java.util.Scanner;
public class palindrome
{
	public static void main(String []  args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter a no.: ");
		int num,temp,rev=0,b;
		num=sy.nextInt();
		b=num;
		while(num!=0)
		{
			temp=num%10;//1
			rev=(temp*temp*temp)+rev;//1
			num/=10;
		}
		if (rev==b)
		{
			System.out.print("yes no. is armstrong no.");
		}
		else
		{
			System.out.println("No. is not armstrong no.");
		}
	}
}