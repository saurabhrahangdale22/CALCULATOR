import java.util.Scanner;
class CALCULATOR 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num 1 :");
		float num1= sc.nextFloat();
	System.out.println("Enter num 2 :");
		float num2 =sc.nextFloat();
	System.out.println("Enter operator:");
	char ch = sc.next().charAt(0);
	float opt =0;
	opt = (ch == '+')?(num1 + num2):
          (ch == '-')?(num1 - num2):
         (ch == '*')?(num1 * num2):
        (ch == '/')?(num1 / num2):
	    (ch == '%')?(num1 % num2):0.00001f;
		
	String output = num1 +" "+ch +""+num2+"="+opt;
	if (!(opt == 0.0000f))
	{
		System.out.println(output);
	}
	}
}

	
