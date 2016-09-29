import java.util.Scanner;
public class Rectangle
{
	static String var1 = "Your rectangle is ";
	static double length;
	static double width;
	static String var5 = " ft around";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter length:");
		length = kb.nextInt();
		System.out.println("Please enter width");
		width = kb.nextDouble();
		print();
	}
	
	public static double calcPerim()
	{
		return(2*length + 2*width);
	}
	
	public static void print()
	{
		System.out.println(var1 + calcPerim() + var5);
	}
}