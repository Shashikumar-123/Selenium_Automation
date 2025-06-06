package While;

public class Odddigits {
	public static void main(String[] args) {
int no = 1435;
while (no!=0)
{
		int rem = no % 100;
System.out.println(rem);
			if(rem %2==1)
			{
		System.out.println("odd");
}
	else
	{
		System.out.println("even");
	}
		no	= no/100;
	}

}}