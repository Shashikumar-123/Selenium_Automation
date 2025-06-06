package Javapractice_Concepts;

public class Call_by_value {
void mobile()
{
	System.out.println("purchase one mobile");
}
 static void shop(Call_by_value c1)
{
	c1.mobile();
}
	
	public static void main(String[] args) {
		Call_by_value v=new Call_by_value();
		v.mobile();
		//Call_by_value v1=new Call_by_value();
		shop(v);
	}

}
