import java.util.*;
public abstract class Car implements Location
{
	private final int ID;
	private double[] location = new double[2];
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double Xc, double Yc)
	{
		location[0] += Xc;
		location[1] += Yc;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc() 
	{
        return location;
    }
}