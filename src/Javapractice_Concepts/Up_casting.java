package Javapractice_Concepts;


class Sample
{
	void disp()
	{
		System.out.println("this is super class");
	}
}
class text extends Sample
{
	void call()
	{
		System.out.println("this is sub class");
	}
}

public class Up_casting {

	public static void main(String[] args) {
  Sample s =new text();//implecitly
  s.disp();
Sample s1 = (Sample)new text();//explecitly
s1.disp();
//we can access both implecit and explecit but we access only super calss we cannot access sub class object
	}

}
