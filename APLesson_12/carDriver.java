import java.util.Scanner;
public class carDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter paint color: ");
		String paint = kb.nextLine();
		
		System.out.println("Enter interior type: ");
		String interior = kb.nextLine();
		
		System.out.println("Enter engine type: ");
		String engine = kb.nextLine();
		
		System.out.println("Enter tires: ");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready.....\n" + "Paint: " + object.getpaint()+ "\nInterior: " + object.getinterior() +"\nEngine: " + object.getengine() + "\nTires: " + object.gettires());
	}
}