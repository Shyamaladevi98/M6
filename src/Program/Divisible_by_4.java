package Program;
import java.util.Scanner;
public class Divisible_by_4
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=s.nextInt();
		switch(a%4)
		{
		case 0:
			System.out.println(a+" is Divisible by 4");
			break;
		case 1:
			System.out.println(a+" is not Divisible by 4");
			break;
		case 2:
			System.out.println(a+" is not Divisible by 4");
			break;
		case 3:
			System.out.println(a+" is not Divisible by 4");
			break;
		}
	}
}
