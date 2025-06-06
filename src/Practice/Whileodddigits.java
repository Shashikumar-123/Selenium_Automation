package Practice;

public class Whileodddigits {

	public static void main(String[] args) {
int no=143;
while(no!=0)
{
	int rem = no%10;
if(rem%2==0)
{
	System.out.println(rem+"even");
}

	no = no/10;
}
}


}