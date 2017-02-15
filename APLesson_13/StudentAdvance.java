public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString() 
	{
        return "Serial Number: " + getserialNo() + "\nPrice: " + getPrice() + "\n(STUDENT ID REQUIRED)";
    }
}