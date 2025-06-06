package Practice;

public class Reverse {

	public static void main(String[] args) {
		/*int  no=1234;
		int rev =0;
		while(no!=0)
		{
			int rem = no%10;
		rev=(rev*10)+rem;
		System.out.println(rev);
		no =no/10;
		
		}

	}

}*/
		
		int no=121;
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem =no%10;
			rev = (rev*10)+rem;
			System.out.println(rev);
			if(copy==rev)
			{
				System.out.println("palendrome");
			}
			else
			{
				System.out.println("Not a palendrome");
			}
			no =no/10;
		}
}
}