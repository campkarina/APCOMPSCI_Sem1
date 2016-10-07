import java.util.Scanner;
public class discountReceipt
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		discountReceipt form = new discountReceipt();
		
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
		
		kb.nextLine();
		
		System.out.println("Please enter item 4:");
		String item4 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price4 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		
		double subtotal = price1 + price2 + price3 + price4;
		form.format("Subtotal:", subtotal);
		double disc = discount(subtotal);
		
		double discount = (0.15*subtotal);
		form.format("Discount(only added if $2000+):", discount);
		

		form.format("Total:", disc);
		
		double Tax = .08 * disc;
		form.format("Tax:", Tax);
		
		double taxTotal = Tax + disc;
		form.format("Final Total:", taxTotal);
		
		System.out.println("\n___________________________________________");
		System.out.println("\n* Thank you for your support *");
	}
	
	public static double discount(double subtotal)
	{
		double price = 0;
		if (subtotal <= 2000)
			price = subtotal;
		
		if (subtotal >= 2000)
			price = subtotal - (.15)*subtotal;
		
		return price;
		
	}
	public void format(String item, double price)
	{
		System.out.printf("* %35s ......... %20.2f\n", item, price);
	}
}