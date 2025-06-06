package Practice1;

public class Count_no_of_words_in_sentence {

	public static void main(String[] args) {
String s="Shashi as Automation tester";
String [] x=s.split(" ");
for(int i=0;i<=x.length-1;i++)
{
	
		System.out.println(x[i].length());
	}
}
	}

