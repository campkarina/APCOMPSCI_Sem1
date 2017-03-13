import java.util.*;

public class Toyota extends Car 
{
    private double moveX, moveY;
	
    public Toyota(String Po) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(Po.split(", ")));
        Double PoX = Double.parseDouble(position.get(0)), PoY = Double.parseDouble(position.get(1));
        move(PoX, PoY);
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