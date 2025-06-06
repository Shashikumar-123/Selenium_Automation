package Practice;

public class Arrayevennum {
/*
	public static void main(String[] args) {
int []a= {10,15,20,25};
{
	for(int i=0;i<=a.length-1;i++)
	{
		if (a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
	}

}*/
	
	int para(int[]a)
	{
		for(int i=0;i<=a.length-1;i++)
		
			if(a[i]%2==0)
			{
				return(a[i]);
		}
		
		return -1;
	}
		public static void main(String[]args)
		{
			Arrayevennum ar = new Arrayevennum();
			int[]a= {5,10,15,20,25};
		int res = ar.para(a);
		System.out.println(res);
		}
		}
