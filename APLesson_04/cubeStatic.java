import java.util.Scanner;
public class cubeStatic
{
	static double side;
	static double surfaceArea;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the value of the side");
		side = kb.nextInt();
		
		calcSurf();
		System.out.printf("The surface area of a cube with " + side + " sides is %10.5f", calcSurf());
	}
	
	public static double calcSurf()
	{
		return ((side*side) * 6);
	}
}