public class TicketDriver
{
	public static void main(String[]args) 
	{
		Ticket w = new Walkup();
		System.out.println("Walkup Receipt \n" + w);
		
		Ticket a = new Advance();
		System.out.println("\nAdvance Receipt \n" + a);
		
		Advance sa = new StudentAdvance();
		System.out.println("\nStudent Advance Receipt \n" + sa);
		
    }
}