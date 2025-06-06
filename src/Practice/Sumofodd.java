package Practice;

public class Sumofodd {

static int abc(int a,int b)
{
	int sum=0;
	for(int i=a;i<=b;i++)
		if (i%2==1)
		{
			sum=sum+i;
		}
		return sum;
}
public static void main(String[] args) {
	int ss = abc(1,10);
	System.out.println(ss);

	}

}
