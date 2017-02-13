public abstract class Console extends GameSystem
{
	private String Controller;
	
    public Console() 
	{
        super();
    }
	
    public Console(String p)
	{
        super(p);
    }
	public abstract String getController();
    public String toString() 
	{
        return "Platform: " + this.getPlatform() + "\nSerial Number: " + this.getserialNo() + "\nController: " + getController();
    }
}