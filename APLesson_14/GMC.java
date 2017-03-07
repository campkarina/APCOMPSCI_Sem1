public class GMC implements Location
{
	private double Xc,Yc;
	
	public GMC()
	{
		Xc = 0;
		Yc = 0;
	}
	
	public GMC(double X, double Y)
	{
		Xc = X;
		Yc = Y;
	}
	
	public int getID()
	{
		return(int)(Math.random() * 1000000)+1;
	}
	
	public void move(double X, double Y)
	{
		Xc = X;
		Yc = Y;
	}
	
	public double[] getLoc()
	{
		double[] location = {Xc,Yc};
		return location;
	}
}