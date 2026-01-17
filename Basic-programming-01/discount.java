import java.util.Scanner;
class discount
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter fees amount");
		double fees=sy.nextInt();
		System.out.print("enter discount percent");
		int discountpercent =sy.nextInt();
		double discount=(discountpercent/100)*fees;
		double price = fees-discount;
		System.out.print("discount" + discount);
		System.out.print("price"+ price);
	}
}