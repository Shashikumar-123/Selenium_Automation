package Practice;

public class Reversesentence {

	public static void main(String[] args) {
String s="Today ind vs pak match";
String[] st = s.split("");
for(int i=st.length-1;i>=0;i--)
{
	System.out.print(st[i]+"");
}
	}

}
