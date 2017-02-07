public class ToyRunner 
{
	private AFigure af = new AFigure();
	private Car c = new Car();
	
    public static void main(String[]args) 
	{
        ToyStore inv = new ToyStore("Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure");
        System.out.println(inv);
        System.out.println(inv.getMostFrequentToy());
        System.out.println(inv.getMostFrequentType());
    }
}