import java.util.Scanner;
public class circle
{
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		r = kb.nextInt();
		
		print();
	}
	
	public static double calcArea()
	{
		return(3.14* (r*r));
	}
	
	public static void print()
	{
		System.out.println("The area of a circle  with a radius of " + r + " is " + calcArea() + ".");
	}
}