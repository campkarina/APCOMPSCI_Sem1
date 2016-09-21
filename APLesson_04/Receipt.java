import java.util.Scanner; 

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Receipt form = new Receipt();
		
		
		System.out.println("Please enter item 1:");
		
		String item1 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		
		System.out.println("Please enter item 2:");
		
		String item2 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		
		System.out.println("Please enter item 3:");
		
		String item3 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		double Subtotal = price1 + price2 + price3;
		form.format("Subtotal:", Subtotal);
		double Tax = .08 * Subtotal;
		form.format("Tax:", Tax);
		double Total = Subtotal + Tax;
		form.format("Total:", Total);
		
		System.out.println("\n___________________________________________");
		System.out.println("\n* Thank you for your support *");
	}	
	
	public void format(String item, double price)
	{
		System.out.printf("* %20s ......... %10.2f\n", item, price);
	}
}