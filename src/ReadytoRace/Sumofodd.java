package ReadytoRace;

public class Sumofodd {

	public static void main(String[] args) {
int no = 143;
int even_sum = 0;
int odd_sum = 0;
while(no!=0)
{
	int rem = no%10;
	System.out.println(rem);
if	(rem%2==0)
{
even_sum = even_sum+rem;
}
else
{
odd_sum = odd_sum+rem;
}
no = no/10;
System.out.println(even_sum);
System.out.println(odd_sum);
	}

}}

