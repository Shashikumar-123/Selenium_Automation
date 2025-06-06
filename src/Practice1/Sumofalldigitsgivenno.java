package Practice1;

public class Sumofalldigitsgivenno {

	public static void main(String[] args) {
int no=154;
int sumeven=0;
int sumodd=0;
while(no!=0)
{
	int rem=no%10;
	if(rem%2==0)
	{
sumeven=	sumeven+rem;
	}
	else
	{
		sumodd=sumodd+rem;
	}

	no=no/10;
}
	System.out.println(sumeven);
	System.out.println(sumodd);
	
	
}
}

