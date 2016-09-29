import java.util.Scanner;
public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		r = kb.nextInt();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (3.14* (r*r));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle  with a radius of " + r + " is %10.5f", area);
	}
}