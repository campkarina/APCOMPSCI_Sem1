import java.util.Scanner; 

public class bmi
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		double height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextInt();

		calcBMI(height, weight);
	}
		public static void calcBMI(double height, double weight)
		{
			
		double BMI = ((weight * 703) / (height*height));
		String condition = "";
			if (BMI < 18.5)
				condition = "Underweight";
			else if (BMI <= 24.9)
				condition = "Normal";
			else if (BMI <= 29.9)
				condition = "Overweight";
			else if (BMI <= 34.9)
				condition = "Obese";
			else if (BMI <=39.9)
				condition = "Very Obese";
			else
				condition = "Morbidly Obese";
			
			System.out.printf("BMI: %5.3f", BMI);
			System.out.println("\nYou are " + condition);

		}
}