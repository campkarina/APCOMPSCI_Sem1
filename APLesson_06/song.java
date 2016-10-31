import java.util.Scanner;
public class song
{
	public static void main(String[]args)
	{
		String word1 = "Na Na Na Na";
		String word2 = "Hey Hey Hey";
		String word3 = "Goodbye!";
		sing(word1);
		sing(word1);
		sing(word2);
		sing(word3);
	}
	public static void sing(String word)
	{
		for(int i = 0; i < 1; i++)
		{
			System.out.println(word);
		}
	}
}