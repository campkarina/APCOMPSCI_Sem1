import java.util.Scanner;
public class MPHRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a Distance: ");
		int distance = kb.nextInt();
		
		System.out.println("Enter Hours: ");
		int hours = kb.nextInt();
		
		System.out.println("Enter Minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getdistance()+ " miles in " + object.gethours()+ " hours and " + object.getminutes() + " minutes = " + object.getMilesPerHour()+ " mph");

		object.setValues(200, 5, 30);
		System.out.println(object.getdistance()+ " miles in " + object.gethours()+ " hours and " + object.getminutes() + " minutes = " + object.getMilesPerHour()+ " mph");
	}
}