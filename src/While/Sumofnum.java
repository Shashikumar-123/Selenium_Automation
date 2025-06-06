package While;

public class Sumofnum {
	public static void main(String[] args) {

	int no=1234;
	int sum = 0;
	while (no!=0)
	{
		int rem = no%100;	
	sum = sum+rem;	
	System.out.println(sum);
	}
 no = no/100;

}

	}

