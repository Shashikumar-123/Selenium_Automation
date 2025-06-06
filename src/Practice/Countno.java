package Practice;

public class Countno {

	public static void main(String[] args) {
	
		/* length of given text
		String s="   this is shashi kumar";
		String[]st= s.split(" ");
		System.out.println(st.length);//7
		*/
		
		String s="this is shashi kumar";
		String [] st = s.split(" ");
		for(int i=0;i<=st.length-1;i++)
		{
			System.out.println(st[i]+" "+ st[i].length());	}

}
}