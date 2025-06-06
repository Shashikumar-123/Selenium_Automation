package Javapractice_Concepts;

interface Relation
{
	void shashi();
	
}
class Nagaraju implements Relation
{
	public void shashi()
	{
		System.out.println("father");
	}
}
class Leelavathi implements Relation
{
	public void shashi()
	{
		System.out.println("mother");
	}
}
class Pallavi implements Relation
{
	public void shashi()
	{
		System.out.println("Brother");
	}
}
class Harika implements Relation
{
	public void shashi()
	{
		System.out.println("Husband");
	}
}
class Male
{
	static void call(Relation r)
	{
		r.shashi();
	}}
public class Polymorphism {

	public static void main(String[] args) {
		Nagaraju n=new Nagaraju();
		Leelavathi l=new Leelavathi();
		Pallavi p=new Pallavi();
		Harika h=new Harika();
		
		Male.call(n);
		Male.call(l);
		Male.call(p);
		Male.call(h);
	}

	}


