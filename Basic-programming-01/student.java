import java.util.Scanner;
class student
{
	public static void main(String [] args)
	{
		Scanner sy =new Scanner(System.in);
		System.out.print("enter no. of pages");
		int pages=sy.nextInt();
		System.out.print("enter no. of students");
		int students =sy.nextInt();
		int q=pages/students;
		System.out.print("qu is ="+q);
		int rem=pages%students;
		System.out.print("rem is ="+rem);
	}
}