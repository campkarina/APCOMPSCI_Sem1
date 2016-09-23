public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 2;
		int b = 4;
		int product = a * b;
		
		String name = "Karina Camp";
		String address = "123 Sunflower Lane";
		String city = "Sunshine Town, CA ";
		String zip = "12345";
		
		int num1 = 5;
		int num2 = 4;
		int num3 = 8;
		int surfaceArea = (2 * num1 * num2) + (2 * num2 * num3)+ (2 * num1 * num3);
		
		System.out.println("The product is" + " " + product);
		System.out.println("\n" + name + "\n" + address + "\n" + city + zip);
		System.out.println("\nThe surface area of your rectangle is" + " " + surfaceArea);
	}
}