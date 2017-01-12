import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter hair color: ");
		String hair = kb.nextLine();
		
		System.out.println("Enter eye color: ");
		String eyes = kb.nextLine();
		
		System.out.println("Enter skin color: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("\nMy info.....\n" + "Hair: " + object.gethair()+ "\nEyes: " + object.geteyes() +"\nSkin: " + object.getskin());
		
		object.setHuman("blonde", "blue","white");
		System.out.println("\nFriend's info.....\n" + "Hair: " + object.gethair()+ "\nEyes: " + object.geteyes() +"\nSkin: " + object.getskin());
	}
}