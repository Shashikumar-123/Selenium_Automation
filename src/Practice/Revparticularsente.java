package Practice;

public class Revparticularsente {

	public static void main(String[] args) {
		String s=" good morning guys ";
		String []st=s.split(" ");
		
			for(int i=0;i<=st.length-1;i++)
			{
				if(i==2)
				{
				String rev="";
				for(int j=st[i].length()-1;j>=0;j--)
				{
					rev=rev+st[i].charAt(j);
				}
				System.out.print(rev+" ");
				}
				else
				{
					System.out.print(st[i]+" ");
				}
		}
		}}
