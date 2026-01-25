import java.util.Scanner;
public class fact
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		int a,b,c,d,i;
		a=sy.nextInt();
		b=sy.nextInt();
		c=sy.nextInt();
		d=sy.nextInt();
		while (a>0||b>0||c>0||d>0){
		if (a>0 || b>0 || c>0 || d>0)
		{
			i=a+b+c+d;
			System.out.println(+i);
		}
		else if(a>0 || b>0 || c>0 || d==0)
		{
			i=a+b+c;
			System.out.println(+ i);
		}
		else if (a>0 || b>0 || c==0)
		{
			i=a+b;
			System.out.println(+i);
		}
		else if(a>0 || b==0)
		{
			i=a;
			System.out.println(+i);
		}
		}
	}
}