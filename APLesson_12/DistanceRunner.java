import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first x value: ");
		int xOne = kb.nextInt();
		
		System.out.println("Enter first y value: ");
		int yOne = kb.nextInt();
		
		System.out.println("Enter second x value: ");
		int xTwo = kb.nextInt();
		
		System.out.println("Enter second y value: ");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("Distance: " + object.getDist());

		object.setValues(5, 3, 1, 2);
		System.out.println("Distance: " + object.getDist());
	}
}