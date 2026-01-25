import java.util.Scanner;
public class loops
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		//System.out.print("enter a natural no :");
		int a,b,c=0,d;
		a =sy.nextInt();//211
		while(a>0)
		{
			b=a-1;//210
			if(b%10==0)//
			{
				c++;
			}
			a=a/10;//
		}
		System.out.print("the value of the counter 1 is " + c);
	}
}