import java.util.Scanner;
public class adventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome! Would you like to..." +
							"\n 1. Go right" + 
							"\n 2. Go left");
		int choicea = kb.nextInt();
		if(choicea == 1)
		{
			System.out.println("You have encountered a lake! Would you like to..." +
							"\n 1. Build a boat" + 
							"\n 2. Swim");
			int choiceb = kb.nextInt();
			if(choiceb == 1)
			{
				System.out.println("There is a leak! Would you like to..." +
								"\n 1. Plug it with something on the boat" + 
								"\n 2. Jump off and swim");
				int choicec = kb.nextInt();
				if(choicec == 1)
				{
					System.out.println("Uh oh! The plug fell out! You drowned and died.");
				}
				else
				{
					System.out.println("You barely survived and got to the other side!");
				}	
			}
			
			else
			{
				System.out.println("You spot pihranas in the water around you. Do you..." +
								"\n 1. Try to swim away" + 
								"\n 2. Accept your death");
				int choiced = kb.nextInt();
				if(choiced == 1)
				{
					System.out.println("You made it to the other side!");
				}
				else
					System.out.println("RIP");
			}
		}
		else
		{
			System.out.println("You have encountered a monster! Would you like to..." +
							"\n 1. Hide" + 
							"\n 2. Fight it");
			int choicee = kb.nextInt();
			if(choicee == 1)
			{
				System.out.println("Your keys fall out of your pocket and the monster sees you. Do you..." +
								"\n 1. Run away as quickly as you can" + 
								"\n 2. Climb a tree");
				int choicef = kb.nextInt();
				if(choicef == 1)
				{
					System.out.println("You ran so fast the monster lost you!");
				}
				else
					System.out.println("You fell out of the tree and the monster ate you!");
			}
			else
			{
				System.out.println("The fight is unequal matched and you need a weapon. Do you use..." +
								"\n 1. Rocks on the ground below you" + 
								"\n 2. A sharp wooden stick");
				int choiceg = kb.nextInt();
				if(choiceg == 1)
				{
					System.out.println("The monster got even more mad and killed you!");
				}
				else
					System.out.println("You stabbed the monster and it left in tears!");
			}
		}
	}
}