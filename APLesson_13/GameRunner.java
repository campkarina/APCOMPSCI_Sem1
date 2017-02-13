public class GameRunner 
{	
    public static void main(String[]args) 
	{
		GameSystem p = new PC("PC");
		System.out.println(p);
		
		GameSystem x = new XBox();
		System.out.println("\n" + x);
		
		Console ps = new PlayStation();
		System.out.println("\n" + ps);
		
    }
}