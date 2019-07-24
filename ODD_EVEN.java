import java.util.Scanner;
public class ODD_EVEN 
{
	public static  void main(String args[])
	{
		int  num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number:");
		num=sc.nextInt();
		int even = num % 2;
		int odd = num % 2;
		if(even == 0)
		{
			System.out.println("Your number is even number." );
		}
		if(odd == 1)
		{
			System.out.println("Your number is odd number.");
		}
	}
}
