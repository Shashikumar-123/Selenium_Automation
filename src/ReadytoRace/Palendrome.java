package ReadytoRace;

public class Palendrome {

	public static void main(String[] args) {
		int no =141;
		int rev=0;
		int copy = no;
		while(no!=0)
		{
			int rem = no%10;
		rev	= (rev*10)+rem;
		System.out.println(rev);
		no=no/10;
		if(rev==copy)
		{
			System.out.println("palendrome");
		}
		else
		{
			System.out.println("not a palendrome");
			}

		}

	}

}
