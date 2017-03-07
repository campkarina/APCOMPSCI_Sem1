public class Honda implements Location
{
	private double Xc,Yc;
	
	public Honda()
	{
		Xc = 0;
		Yc = 0;
	}
	
	public Honda(double [] location)
	{
		Xc = location[0];
		Yc = location[1];
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