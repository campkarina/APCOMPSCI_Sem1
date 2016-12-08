import java.util.Scanner;
public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][]words = new String[4][4];

		System.out.println("Please enter a word: ");
		String userInput= kb.nextLine();
				
		for(int i = 0; i< words.length; i++)
		{
			for(int j = 0; j<words[i].length; j++)
			{
				words[i][j]= userInput;
			}
		}

		for(int i = 0; i< words.length; i++)
		{
			for(int j = 0; j< words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}