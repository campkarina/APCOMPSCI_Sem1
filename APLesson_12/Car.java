import java.lang.Math;

public class Car
{
	private String paint, interior, engine, tires;
	
	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCar(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//Accessors
	public String getpaint()
	{
		return paint;
	}
	
	public String getinterior()
	{
		return interior;
	}
	
	public String getengine()
	{
		return engine;
	}
	
	public String gettires()
	{
		return tires;
	}
}