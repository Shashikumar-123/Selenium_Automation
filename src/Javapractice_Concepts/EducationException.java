package Javapractice_Concepts;

public class EducationException extends Exception {
String msg;
EducationException(String msg)
{
this.msg=msg;
}
public String getmsg()
{
	return msg;
}
}