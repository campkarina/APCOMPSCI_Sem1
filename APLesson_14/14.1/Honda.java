public class Honda extends Car 
{
    private double moveX, moveY;
	
    public Honda(double[] Po) 
	{
        super();
        move(Po[0], Po[1]);
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