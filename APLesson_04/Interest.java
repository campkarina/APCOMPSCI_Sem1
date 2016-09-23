import java.util.Scanner; 

public class Interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Interest form = new Interest();
		
		
		System.out.println("Please enter the interest rate:");
		double r = kb.nextDouble();
		
		System.out.println("Please enter the principal (the original amount you intend to borrow)");
		double p = kb.nextDouble();

		System.out.println("Please enter the number of times the loan is compounded per year");
		double n = kb.nextDouble();		
		
		System.out.println("Please enter the life of the loan (in years)");
		double t = kb.nextDouble();

		double total = form.payment(r, p, n, t);
		System.out.println("Your total monthly payment is $" + total);
	}	
	
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+ r/n, n*t)))/(t*12);
	}
}