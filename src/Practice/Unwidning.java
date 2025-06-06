package Practice;

public class Unwidning {
	static void abc()
	{
		int a=10/0;
	}
	static void ccc()
	{
		abc();
	}
	static void ddd()
	{
		ccc();
	}

	public static void main(String[] args) {
		abc();

	}

}
