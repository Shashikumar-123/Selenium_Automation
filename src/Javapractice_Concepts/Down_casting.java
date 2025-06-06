package Javapractice_Concepts;

class Sup
{
	void disp()
	{
		System.out.println("this is superclass");
	}
}
class Sub extends Sup
{
	void call()
	{
		System.out.println("this is subclass");
	}
}
public class Down_casting {

	public static void main(String[] args) {
		Sup s = new Sub();
		Sub s1= (Sub)s;
		s1.call();
		s1.disp();
		

	}

}
