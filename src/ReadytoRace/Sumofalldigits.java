package ReadytoRace;

public class Sumofalldigits {

	public static void main(String[] args) {
		int no = 143;
		int sum = 0;
		while (no!=0)
		{
			int rem = no%10;
			sum = rem+1;
			System.out.println(sum);
			no= no/10;
			
		}

	}

}
