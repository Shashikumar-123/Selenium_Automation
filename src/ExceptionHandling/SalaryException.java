package ExceptionHandling;

public class SalaryException extends Exception
{
	String s;
	SalaryException(String s)
	{
this. s=s;	
}
	public String getclarification()
	{
		return s;
	}
}
