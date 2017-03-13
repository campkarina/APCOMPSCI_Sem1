public class GMC extends Car
{
    private double moveX, moveY;
	
    public GMC(double x, double y) 
	{
        super();
        move(x, y);
    }
    public void move(double x, double y) 
	{
        this.moveX += x;
        this.moveY += y;
    }
    public double[] getLoc() 
	{
        double[] location = {moveX, moveY};
        return location;
    }
}