package ReadytoRace;



class Mobile
{
	void camera()
	{
		System.out.println("15mega pixl");
	}
}
class Mobile1 extends Mobile
{
void camera()
{
	System.out.println("25mega pixl");
	super.camera();
}}
class Mobile2 extends Mobile1
{
void camera()
{
	System.out.println("35mega pixl");
	super.camera();
}
}
public class Hiding {

	public static void main(String[] args) {
		Mobile2 m = new Mobile2();
		m.camera();
	}
}



