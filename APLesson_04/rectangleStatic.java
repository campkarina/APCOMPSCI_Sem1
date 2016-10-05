import java.util.Scanner;
public class rectangleStatic
{
	static String var1 = "Your rectangle is ";
	static double length;
	static double width;
	static String var5 = " ft around";
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter length:");
		length = kb.nextInt();
		System.out.println("Please enter width");
		width = kb.nextDouble();
		
		calcPerim();
		System.out.printf(var1 + "%10.5f", calcPerim(), var5);
	}
	
	public static double calcPerim()
	{
		return (2*length + 2*width);
	}

}