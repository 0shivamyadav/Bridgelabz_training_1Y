import java.util.Scanner;
class unitprice
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter unit price");
		int price=sy.nextInt();
		System.out.println("enter quantity to be brought");
		int quantity=sy.nextInt();
		//System.out.println("enter marks of chemistry");
		//int che=sy.nextInt();
		int totalprice=price*quantity;
		System.out.println("total price of the quantity =" + totalprice);
	}
}