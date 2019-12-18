package atm;
import java.util.*;
/**
 *
 * @author Thomas
 */
public class PIN 
{
    private int pin;
    Random r = new Random();
    
    public void PIN(int input)
    {
        pin = input;
    }
    
    public void PIN()
    {
        pin = r.nextInt(1000);
    }
    
    public void setPIN(int pin_input)
    {
        pin = pin_input;
    }
    
    public void setPIN()
    {
        pin = r.nextInt(1000);
    }
    
    public int getPIN()
    {
        return pin;
    }
    	
    public boolean validate(int comp_pin)
    {
        
		if(pin == comp_pin)
		{
			return true;
		}
	else
	{
		return false;
	}
    }
    
    
}
