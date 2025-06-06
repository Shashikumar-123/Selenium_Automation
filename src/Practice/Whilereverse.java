package Practice;

public class Whilereverse {

	public static void main(String[] args) {
int no=123456;
int rev=0;
int copy=no;
while(no!=0)
{
int res	= no%10;
rev=(rev*10)+res;
no=no/10;
System.out.println(rev);


}
	}

}
