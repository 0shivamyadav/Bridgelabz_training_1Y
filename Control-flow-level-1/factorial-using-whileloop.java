import java.util.*;
public class fact
{
	public static void main(String [] args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter a no: ");
		int a,fact=1,b;
		a=sy.nextInt();
		int i=1;
		while(i<=a){
		fact=fact*i;
		i++;
		}
		System.out.print("factorial of" +a+ " is "+fact);
	}
}