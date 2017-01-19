import java.util.Scanner;

public class inventory
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	public inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "food";
		price = 5.00;
		UPC = (int)(Math.random() * 1000000) + 1;
	}
	
	public inventory(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
		UPC = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Product Info...\nManufacturer: " + manufacturer +
								"\nName: " + name +
								"\nCategory: " + category +
								"\nUPC: " + UPC +
								"\nPrice: " + price;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
			
		System.out.println("Enter manufacturer:");
		String manufacturer = kb.nextLine();
			
		System.out.println("Enter name:");
		String name = kb.nextLine();
		
		System.out.println("Would you like to enter category and price? (y or n)");
		String yOrN = kb.nextLine(); 
		
		if (yOrN.equals("n"))
		{
			inventory pH = new inventory(manufacturer, name);
			System.out.println(pH);
		}
		else if(yOrN.equals("y"))
		{
			System.out.println("Please enter category: ");
			String category = kb.nextLine();
			System.out.println("Please enter price: ");
			Double price = kb.nextDouble();
			inventory pH2 = new inventory(manufacturer, name, category, price);
			System.out.println(pH2);
		}		
	}
}