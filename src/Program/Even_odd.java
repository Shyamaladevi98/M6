package Program;
import java.util.Scanner;
public class Even_odd
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=s.nextInt();
		switch(a%2)
		{
			case 0:
				System.out.println(a+" is Even");
				break;
			case 1:
				System.out.println(a+" is Odd");
		}
		
	  }
}
