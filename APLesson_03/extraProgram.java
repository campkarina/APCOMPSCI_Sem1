import java.util.Scanner; 

public class extraProgram
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall are you in feet (if 5 feet 2 inches round to lower foot amount aka 5 feet)? ");
		
		double feet = keyboard.nextInt();
		
		System.out.println("How many more inches besides that " + feet + " feet (if 5 feet 2 inches enter 2)? ");
		
		double inches = keyboard.nextInt();

		double total = (12 * feet) + inches;
		
		System.out.println("Your height in inches is: " + total + " inches.");
	}
}