package Javapractice_Concepts;

abstract class paren
{
	abstract void what();
	abstract void when();
}
abstract class chi extends paren
{
	void what()
	{
		System.out.println("what clear");
	}
}
class subch extends chi
{
	void when()
	{
		System.out.println("when also clear");
	}
}
public class multiple_level {

	public static void main(String[] args) {
		subch s= new subch();
		s.what();
		s.when();

	}

}
