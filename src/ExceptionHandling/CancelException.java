package ExceptionHandling;

public class CancelException extends Exception{
	String msg;

	CancelException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
