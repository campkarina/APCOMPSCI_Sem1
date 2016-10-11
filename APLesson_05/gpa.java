import java.util.Scanner; 

public class gpa
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Math Grade: ");
		String grade1 = keyboard.next();
		
		System.out.println("English Grade: ");
		String grade2 = keyboard.next();
		
		System.out.println("Science Grade: ");
		String grade3 = keyboard.next();
		
		System.out.println("History Grade: ");
		String grade4 = keyboard.next();
		
		System.out.println("Language Grade: ");
		String grade5 = keyboard.next();
		
		System.out.println("Elective 1 Grade: ");
		String grade6 = keyboard.next();
		
		System.out.println("Elective 2 Grade: ");
		String grade7 = keyboard.next();
		
		double gpa = (calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7))/7;
		
		System.out.printf("GPA: %5.2f", gpa);
	}
		public static double calcPoints(String grade)
		{
			if (grade.equals("A"))
				return 4.0;
			if (grade.equals("B"))
				return 3.0;
			if (grade.equals("C"))
				return 2.0;
			if (grade.equals("D"))
				return 1.0;
			else
				return 0;
		}
}