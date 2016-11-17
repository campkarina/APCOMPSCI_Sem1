import java.util.Scanner;
public class firstLetter
{
	public static void main(String[]args)
	{
		String[]names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 names:");
		
		for(int i=0; i< names.length; i++)
		{
			names[i] = kb.next();
		}
		
		System.out.print("Inputted words...");
		for(String name : names)
		{
			System.out.print("\"" + name + "\",");
		}
		System.out.print("\nFirst Letters...");
		first(names);
	}
		
	public static void first(String[] names)
	{
		for(String n: names)
			
			{
				System.out.print("\"" + n.charAt(0) + "\",");
			}
	}
}