public abstract class Toy 
{
    private String name;
    private int count;
	
    public Toy() 
	{
       this.count = 1;
    }
    public Toy(String n) 
	{
        this.count = 1;
        this.name = n;
    }
	
	public abstract String getType();
	
    public String getName() 
	{
        return this.name;
    }
	
    public int getCount()
	{
        return this.count;
    }
	
    public void setName(String n) 
	{
        this.name = n;
    }
	
    public void setCount(int c) 
	{
        this.count = c;
    }

    public String toString() 
	{
        return name + "= " + count;
    }
}
