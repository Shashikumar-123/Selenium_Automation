package Javapractice_Concepts;


public class Encapsulation {

	public static void main(String[] args) {
		Office o= new Office();
o.setAccess_no(134);
System.out.println( o.getAccess_no());
	}	}
class Office
{
	private int Access_no;
	public void setAccess_no(int Access_no)
	{
		this.Access_no=Access_no;
	}
	public int getAccess_no()
	{
		return Access_no;
	}
	
}