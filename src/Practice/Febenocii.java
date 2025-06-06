package Practice;

public class Febenocii {
	/*

	public static void main(String[] args) {
int feb1 =0;
int feb2 =1;
for(int i=1;i<=10;i++)
{
	int feb3 = feb1+feb2;
	feb1 = feb2;
	feb2 = feb3;
	System.out.println(feb1);
	System.out.println(feb2);

	}

}}
*/
	static void fe(int a,int b)
	{
		int feb1 =0;
	int feb2=1;
	for(int i=a;i<=b;i++)
	{
		int feb3= feb1+feb2;
		feb1 = feb2;
		feb2 = feb3;
		System.out.println(feb1);
		System.out.println(feb2);
	}
		
	}
	public static void main(String[] args) {
		fe(1,10);
	}}
