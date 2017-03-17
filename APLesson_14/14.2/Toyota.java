import java.util.*;

public class Toyota extends Car 
{
    public Toyota(String Po) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(Po.split(", ")));
        Double PoX = Double.parseDouble(position.get(0)), PoY = Double.parseDouble(position.get(1));
        super.move(PoX, PoY);
    }
}