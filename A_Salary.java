import java.util.Scanner;
class A_Salary
{

    public static void main(String args[])
        {
             Scanner hs=new Scanner(System.in);

              String name;
              System.out.println("Enter the Name");
             name=hs.nextLine();
              System.out.println("The name of client= "+name);
	
		int BS;
		System.out.println("Enter the Salary");
		BS=hs.nextInt();
		System.out.println("The Salary is="+BS);

		double TA,DA,HRA,GS;
	
	

	          TA=BS*0.45d;
	          DA=BS*0.55d;
	          HRA=BS*0.35d;
	          GS=BS+TA+DA+HRA;

		System.out.println("The Gross Salary of Employee="+GS);

              
               


        }
}