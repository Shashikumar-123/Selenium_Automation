package Interface;

public interface Rapido {
	void book();
}
class Bike implements Rapido
{
	public void book()
	{
		System.out.println("Book bike");
	}
}
class Auto implements Rapido
{
	public void book()
	{
		System.out.println("Auto bike");
	}
}
class Car implements Rapido
{
	public void book()
	{
		System.out.println("Car bike");
	}
}
class Enduser
{
	static void Booking(Rapido r)
	{
		r.book();
	}
}


