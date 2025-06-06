package Javapractice_Concepts;

interface Movie
{
	void pushpa();
	void arya_2();
}
abstract class theatre implements Movie
{
	public void pushpa()
	{
		System.out.println("blockbaster");
	}
}
  class ibomma extends theatre
{
	public void arya_2()
	{
		System.out.println("blockbaster1");
	}
}

public class Interface {

	public static void main(String[] args) {
		ibomma i=new ibomma();
		i.arya_2();
		i.pushpa();

	}

}
