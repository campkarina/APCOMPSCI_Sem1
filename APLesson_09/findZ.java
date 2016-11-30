import java.util.Scanner;
public class findZ
{
	static String[]words = new String[5];
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.print("For the following words: "+"\n");
		printArray();
		System.out.print("Words with Zs: " + "\n");
		System.out.println(hasZ());
	}
		
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String w : words)
		{
			System.out.println(w + " ");
		}
	}
	
	public static String hasZ()
	{
		String zs = "";
		for(String Word : words)
		{
			if (Word.indexOf("z")>= 0 || Word.indexOf("Z")>= 0)
			{
				zs= zs + Word + " " + "\n";
			}
		}
		return zs;
	}
}