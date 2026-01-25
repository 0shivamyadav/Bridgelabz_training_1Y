import java.util.*;
class table
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("enter age of Amar: ");
		int a=sy.nextInt();
		System.out.print("enter height of Amar: ");
		int p=sy.nextInt();
		System.out.print("Enter age of Akbar: ");
		int b=sy.nextInt();
		System.out.print("enter height of Akbar: ");
		int q=sy.nextInt();
		System.out.print("Enter age of Anthony: ");
		int c=sy.nextInt();
		System.out.print("Enter height of Anthony: ");
		int r=sy.nextInt();
		if(a<b || a<c )
		{
			System.out.println("Amar is Youngest");
		}
		else if(b<a || b<c)
		{
			System.out.println("Akbar is Youngest");
		}
		else if(c<a || c<b)
		{
			System.out.println("Anthony is Youngest");
		}
		//else if (p<q || p<r)
		{
			System.out.println("amar is tallest");
		}
		else if (q<p || q<r)
		{
			System.out.println("akbar is tallest");
		}
		else if (r<p || r<q)
		{
			System.out.println("anthony is tallest");
		}
		
		
	}
}
		
		