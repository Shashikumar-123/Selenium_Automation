package Practice;

public class Arraywillbecome {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
	
			if(a[i]%2==1)
		{
			sum = sum+i;
		}
		System.out.println(sum);

	}
	

}
