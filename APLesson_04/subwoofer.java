import java.util.Scanner; 

public class subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		subwoofer form = new subwoofer();

		System.out.println("Please enter height in inches:");
		double h = kb.nextDouble();
		
		System.out.println("Please enter lenth in inches:");
		double l = kb.nextDouble();

		System.out.println("Please enter width in inches:");
		double w = kb.nextDouble();		


		double vol = form.calcVol(h, l, w);
		System.out.println("The volume is " + vol + " cubic feet");
	}	
	
	public double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}