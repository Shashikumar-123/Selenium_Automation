package Practice;

public class Whilesumof {

	public static void main(String[] args) {
int no=123;
int sum=0;
while (no!=0)
{
	int rem = no%10;
	sum = sum+rem;
	System.out.println(sum);
no	=no/10;
}
	}

}
