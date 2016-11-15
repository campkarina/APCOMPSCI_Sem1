import java.util.Scanner;
public class treeDeg
{
	static String word;
	
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   word = kb.next();
	   int stop = word.length();
	   int start = 0;
	   System.out.println(tree(word, start, stop));
	}

	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(word.substring(0,start));
			start+=1;
			tree(word, start, stop);
		}
		return "";
	}
}
