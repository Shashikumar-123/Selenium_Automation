package ExceptionHandling;

public class ShadiException extends Exception
{
	
	  String msg;

	ShadiException(String msg)
	{
		this.msg=msg;
	}

	public String getmsg()
	{
return msg;
	}

}
