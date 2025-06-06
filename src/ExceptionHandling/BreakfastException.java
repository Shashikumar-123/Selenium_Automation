package ExceptionHandling;

public class BreakfastException extends Exception{
	String msg;
	BreakfastException(String msg)
	{
		this.msg=msg;
	}
public String getmsg()
	{
		return msg;
	}

}
