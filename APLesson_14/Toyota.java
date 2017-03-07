public class Toyota implements Location
{
	private double[] location;
	private double Xc,Yc;
	
	public Toyota()
	{
		location= new double[2];
	}
	
	public Toyota(String T)
	{
		Xc = Double.parseDouble(T.substring(0,1));
		Yc = Double.parseDouble(T.substring(3));
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