import java.util.Scanner;

public class User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setUser(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
			
		System.out.println("Enter first name:");
		String firstName = kb.nextLine();
			
		System.out.println("Enter last name:");
		String lastName = kb.nextLine();
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String yOrN = kb.nextLine();
		
		if (yOrN.equals("n"))
		{
			User pH = new User(firstName, lastName);
			System.out.println(pH);
		}
		else if(yOrN.equals("y"))
		{
			System.out.println("Please enter your avatar: ");
			String avatar = kb.nextLine();
			User pH2 = new User(firstName, lastName, avatar);
			System.out.println(pH2);
		}		
	}
}