package ReadytoRace;

public class Oddingivennumber {

	public static void main(String[] args) {
int no=143;
while (no!=0)
{
	int rem = no%10;
	System.out.println(rem);

	if(rem%2==1)
	{
		System.out.println("odd");
	}
	else
	{
		System.out.println("not a odd");
	}
no = no/10;
}
	}
}
