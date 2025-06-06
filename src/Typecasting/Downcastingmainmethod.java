package Typecasting;

public class Downcastingmainmethod {

	public static void main(String[] args) {
	Super s = new Sub();
	Sub a = (Sub)s;
	a.call();
	a.disp();
	
	}

}
