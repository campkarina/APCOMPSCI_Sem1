import java.util.Scanner;
public class circleStatic
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		r = kb.nextInt();
		
		calcArea();
		System.out.printf("The area of a circle  with a radius of " + r + " is %10.5f", calcArea());
	}
	
	public static double calcArea()
	{
		return (3.14* (r*r));
	}
}