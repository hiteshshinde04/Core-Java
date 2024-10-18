import java.util.Scanner;
class AllPrograms{

	//Addition of two number
	public void Addition(){
	int a,b,sum=0;
	char opt;
	Scanner hs=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=hs.nextInt();

	System.out.println("Enter the value of b");
	b=hs.nextInt();

	sum=a+b;
	System.out.println("Sum of two number:"+sum);
	}
	
	//Subtraction of two number
	public void Subtraction(){
	int a,b,sub=0;
	char opt;
	Scanner hs=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=hs.nextInt();

	System.out.println("Enter the value of b");
	b=hs.nextInt();

	sub=a-b;
	System.out.println("Subtraction of two number:"+sub);
	}

	//Multiplication of two number
	public void Multiplication(){
	int a,b,mul=0;
	char opt;
	Scanner hs = new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=hs.nextInt();

	System.out.println("Enter the value of b");
	b=hs.nextInt();

	mul=a*b;
	System.out.println("Mul of two number:"+mul);	
	}

	//Division of two number
	public void Division(){
	int a,b,div=0;
	char opt;
	Scanner hs = new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=hs.nextInt();
	
	System.out.println("Enter the value of b");
	b=hs.nextInt();

	div=a/b;
	System.out.println("Division of two number:"+div); 
	}

	//Modulo of two number
	public void Modulo(){
	int a,b,mod=0;
	char opt;
	Scanner hs = new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=hs.nextInt();

	System.out.println("Enter the value of b");
	b=hs.nextInt();
	
	mod=a%b;
	System.out.println("Modulo of two number:"+mod);
	}

	//Area of triangle
	public void Areaoftriangle(){
	double base=30;
	double height=20;
	double area;
	area=0/5*base*height;
	System.out.println("Area of triangle:"+area);
	}

	public static void main(String[]args){
		AllPrograms h1 = new AllPrograms();
		do{
			System.out.println("1.Sum of two number");
			System.out.println("2.Sub of two number");
			System.out.println("3.Mul of two number");
			System.out.println("4.Div of two number");
			System.out.println("5.Mod of two number");
			System.out.println("6.Area of triangle");
			System.out.println("Enter your choise");
			opt = hs.next().charAt(0);
			switch(opt){
				case 1: h1.Addition();
					break;
				case 2: h1.Subtraction();
					break;
				case 3: h1.Multiplication();
					break;
				case 4: h1.Division();
					break;
				case 5: h1.Modulo();
					break;
				case 6: h1.Areaoftriangle();
					break;
				default("!invalid choise");
					break;
			}
		}while(opt!=6);	
	}
}