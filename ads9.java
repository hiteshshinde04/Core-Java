//program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;
class ads9
 {


 public static void main(String[] args) {

char ch;

        Scanner hs = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        ch = hs.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is A ALPHABET.");

        } 
	else if(ch >= '0' && ch <= '9') 
		{

            	 System.out.println(ch + " is A DIGIT.");

        } 
	else {

             System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    
    }
}