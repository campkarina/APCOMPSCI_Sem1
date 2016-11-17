import java.util.Scanner;
public class reverseWord
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
		
		System.out.print("In order...");
		for(String name : names)
		{
			System.out.print("\"" + name + "\",");
		}
		
		System.out.print("\nReversed...");
		reverse(names);
	}
		
	public static void reverse(String[] names)
	{
		for(int i=names.length-1; i>= 0; i--)
			
			{
				System.out.print("\"" + names[i] + "\",");
			}
	}
}