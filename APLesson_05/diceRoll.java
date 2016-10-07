import java.util.Random;
public class diceRoll
{	
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is....." + winner);
	}
	
	public static String rollDice(int player, int computer)
	{
		String winner = "";
		if (player > computer)
			winner = "Player";
		
		if (computer > player)
			winner = "Computer";
		
		if (computer == player)
			winner = "Neither, it was a tie!";
		
		return winner;
	}
}