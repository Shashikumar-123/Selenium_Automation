package Javapractice_Concepts;


class p1
{
	void cycle1()
	{
		System.out.println("having cycles");
	}
}
class c1 extends p1
{
	void bike()
	{
		System.out.println("having bullet");
	}
}
class c2 extends p1
{
	void car()
	{
		System.out.println("having creta");
	}
}
class c3 extends c1
{
	void train()
	{
		System.out.println("having train");
	}
}
public class Hierarchi_Hybrid {

	public static void main(String[] args) {
		c2 c=new c2();
		c.cycle1();
		c.car();
		c1 x= new c1();
		x.bike();
		x.cycle1();
		
		c3 v=new c3();
		v.bike();
		v.cycle1();
		v.train();

	}

}
