public class Car extends Toy 
{
	private String Car;
	
    public Car()
	{
        super("Car");
    }
    public Car(String n)
	{
        super(n);
    }
    public String getType()
	{
        return "Car";
    }
}