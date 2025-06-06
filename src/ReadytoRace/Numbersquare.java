package ReadytoRace;

public class Numbersquare {

	public static void main(String[] args) {
		int no=143;
		while(no!=0)
		{
			int rem = no%10;
			System.out.println(rem*rem);
			no = no/10;
		}

	}

}
