package Arrayprogrammes;

public class Arrayevennumber {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		for(int i=0; i<=arr.length-1;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
			System.out.println(arr[i]);
		}
		

}
}
