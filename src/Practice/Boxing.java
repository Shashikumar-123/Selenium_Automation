package Practice;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add(10);
a.add(20);
a.add("shashi");
a.add(null);
a.add('A');
System.out.println(a);

for(Object w:a)
{
	System.out.print(w+" ");
}

}
}