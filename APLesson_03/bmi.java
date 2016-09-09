import java.util.Scanner; 

public class bmi
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches? ");
		
		double height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds? ");
		
		double weight = keyboard.nextInt();
		
		double bmi = ((weight * 703) / (height*height));
		
		System.out.println("Your BMI is: " + bmi);
	}
}