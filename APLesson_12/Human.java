import java.lang.Math;

public class Human
{
	private String hair, eyes, skin;
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human (String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHuman(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}

	public String gethair()
	{
		return hair;
	}
	
	public String geteyes()
	{
		return eyes;
	}
	
	public String getskin()
	{
		return skin;
	}
}