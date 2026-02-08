import java.util.*;
public class ToFindBmi
{
	public static void main(String[]args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter no. of peoples: ");
		int n=sy.nextInt();
		double h[][] =new double[n][3];
		double w[][] =new double[n][3];
		double bmi[][] = new double[n][3];
		String status[] =new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter height(in meters): ");
			h[i][0]=sy.nextDouble();
			System.out.print("Enter weight(in kg): ");
			w[i][0]=sy.nextDouble();
			
		}
		for(int i=0;i<n;i++)
		{
			bmi[i][0]=w[i][0]/(h[i][0]*h[i][0]);
			if(bmi[i][0]<18.5)
			{
				status[i]="under weight";
			}
			else if(bmi[i][0]<25)
			{
				status[i]="Normal weight";
			}
			else if(bmi[i][0]<30)
			{
				status[i]="Over weight";
			}
			else 
			{
				status[i]="obese";
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("for people: " + (i+1));
			System.out.println("height is :" +h[i][0]);
			System.out.println("weight is: "+w[i][0]);
			System.out.println("status : "+status[i]);
		}
		
	}
}