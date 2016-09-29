import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number 1");
		num1 = kb.nextInt();
		System.out.println("Please enter number 2");
		num2 = kb.nextDouble();
		System.out.println("Please enter number 3");
		num3 = kb.nextDouble();
		
		print();
	}
	
	public static double average()
	{
		return((num1+num2+num3)/3);
	}
	
	public static void print()
	{
		System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " is " + average() + ".");
	}
}