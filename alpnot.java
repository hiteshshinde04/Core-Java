//program to check whether a character is alphabet or not.
import java.util.Scanner;
class alpnot
{
	public static void main(String[]args)
	{
	Scanner hs = new Scanner(System.in);
	char c='*';
	System.out.println("Enter the character");
	c=hs.next().charAt(0);
	
	if((c>='a') && (c<='z') || (c>='A') && (c<='Z')){
	System.out.println("The value are alphabet");
	}
	else
	{
	System.out.println("The value are not alphabet");
	}
	}
}