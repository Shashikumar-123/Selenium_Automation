package Javapractice_Concepts;

public class Constructorpra {
int Emp_count;
static double sal = 23.700;
String project;
double experience;
Constructorpra(int Emp_count,String project,double experience)
{
	this.Emp_count=Emp_count;
this.project= project;
this.	experience=experience;
	
}
	public static void main(String[] args) {
		Constructorpra shashi=new Constructorpra(40,"Myna",2.5);
		System.out.println(shashi.Emp_count+" "+shashi.experience+" "+ shashi.project);
		Constructorpra ashok=new Constructorpra(30,"playdead",2.5);
		System.out.println(ashok.Emp_count+" "+ashok.experience+" "+ ashok.project+" "+ ashok.sal);


	}

}
