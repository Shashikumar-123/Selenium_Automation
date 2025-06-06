package Practice;

public class Countaftersplit {

	public static void main(String[] args) {
String s="Hi good morning";
String[] str = s.split(" ");
for(int i=0;i<str.length;i++)
{
	System.out.print(str[i]+"-" +str[i].length());
}

	}

}
