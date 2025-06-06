package Javapractice_Concepts;

class Grandparent
{
	void beedi()
	{
		System.out.println("having beedi");
	}
}
class parents extends Grandparent
{
	void cycle()
	{
		System.out.println("having cycle");
	}
}
class child extends parents
{
	void legs()
	{
		System.out.println("not having any thing");
	}
}

public class Inheritance_program {

	public static void main(String[] args) {
		child c= new child();
		c.beedi();
		c.cycle();
		c.legs();

	}

}
