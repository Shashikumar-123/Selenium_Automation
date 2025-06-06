package Practice1;

public class Givennosquare {

	public static void main(String[] args) {
int no=149;

while(no!=0)
{
	int rem=no%10;
int rev=rem*rem;
System.out.println(rev);
no=no/10;
}
	}

}
