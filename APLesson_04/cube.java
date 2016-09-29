import java.util.Scanner;
public class cube
{
	static double side;
	static double surfaceArea;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the value of the side");
		side = kb.nextInt();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		surfaceArea = ((side*side) * 6);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %10.5f", surfaceArea);
	}
}