package Program;
import java.util.Scanner;
public class Even_odd_ifelse
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println(a+" is Even Number");
		else
			System.out.println(a+" is Odd Number");
	}
}
