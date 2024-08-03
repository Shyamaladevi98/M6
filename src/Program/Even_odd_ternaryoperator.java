package Program;
import java.util.Scanner;
public class Even_odd_ternaryoperator 
{
	public static void main(String[]args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int a=s.nextInt();
			String result=a%2==0?a+" is Even Number":a+" is Odd Number";
			System.out.println(result);
		}
	}


