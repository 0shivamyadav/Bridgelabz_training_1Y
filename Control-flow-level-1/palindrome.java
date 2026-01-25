import java.util.*;
public class palindrome
{
	public static void main(String []  args)
	{
		Scanner sy=new Scanner (System.in);
		System.out.print("Enter a no.: ");
		int a=sy.nextInt();
		int b=a;
		int rev=0;
		while(a!=0)
		{
			int temp=a%10;
			rev=rev*10+temp;
			a/=10;
		}
		if (rev==b)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
	}
}