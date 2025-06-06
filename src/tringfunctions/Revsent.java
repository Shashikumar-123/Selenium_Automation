package tringfunctions;

import java.util.Arrays;

public class Revsent {

	
/*String s=" i got job as Automation QA";
String[] st = s.split(" ");
for(int i=st.length-1;i>=0;i--)
{
	System.out.print(st[i]+" ");
}

	}

}

		String s= "Java";
		String rev =" ";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
	}}
	*/
			
		static String abc(String s)
		{
			
			String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		if (s.equals(rev))
		{
		return "palendrome";
		}
		else
		{
			return "not a palendrome";
		}	}
		public static void main(String[] args) {
			String input= "madam";
			System.out.println(abc(input));
		}
}
		
		
	