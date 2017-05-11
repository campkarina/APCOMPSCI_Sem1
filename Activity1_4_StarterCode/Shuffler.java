public class Shuffler 
{
	private static final int SHUFFLE_COUNT = 1;
	private static final int value_count = 10;

	public static void main(String[] args)
	{
		System.out.println("Result of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
        int[] values1 = new int[value_count];
        
		for (int i = 0; i < values1.length; i++) 
		{
            values1[i] = i;
        }
        
		for (int j = 1; j <= SHUFFLE_COUNT; j++) 
		{
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) 
			{
                System.out.printf(" %2d", values1[k]);
            }
            System.out.println();
        }
		
        System.out.println();

        System.out.println("Result of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
        int[] values2 = new int[value_count];
        
		for (int i = 0; i < values2.length; i++) 
		{
            values2[i] = i;
        }
		
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
		{
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) 
			{
                System.out.printf(" %2d", values2[k]);
            }
            System.out.println();
        }
        System.out.println();
	}

	public static void perfectShuffle(int[] values)
	{
		int[] half1 = new int[value_count / 2];
        int[] half2 = new int[value_count - value_count / 2];

        for(int i = 0; i < value_count / 2; i++) 
		{
            half1[i] = values[i];
        }
        
        for(int i = 0; i < value_count - value_count / 2; i++) 
		{
            half2[i] = values[i + value_count / 2];
        }

        for(int i = 0; i < value_count / 2; i++) 
		{
            values[2 * i] = half2[i];
            values[2 * i + 1] = half1[i];
        }

        if(value_count % 2 != 0) 
		{
            values[value_count - 1] = half2[value_count - value_count / 2];
        }
	}

	public static void selectionShuffle(int[] values)
	{
		for(int k = value_count - 1; k >= 0; k--) 
		{
            int a = (int)(Math.random() * k);
            int b = values[a];
            values[a] = values[k];
            values[k] = b;
		}
	}
}
