public class AFigure extends Toy 
{
	private String AFigure;
	
    public AFigure() 
	{
        super("Action Figure");
    }
    public AFigure(String n)
	{
        super(n);
    }
    public String getType()
	{
        return "Action Figure";
    }
}