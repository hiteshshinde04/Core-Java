//program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;
class adsc
{
	public static void main(String[]args)
	{
	Scanner hs = new Scanner(System.in);
	char c='*';
	System.out.println("Enter your choise");
	c=hs.next().charAt(0);
	
	if(c>='a' && c<='z' || c>='A' && c<='Z')
	{
		System.out.println("This is alphabet");
	}
		else if(c>='0' && c<='9')
		{
		System.out.println("This is digit");
		}
			else
				{
				System.out.println("This is Special character");	
				}
	}
}