package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Public//Sample.txt";
File fil=new File(path);
fil.createNewFile();
FileReader re=new FileReader(fil);
BufferedReader bd=new BufferedReader(re);
String all =bd.readLine();
while(all!= null)
{
	all=bd.readLine();

System.out.println(all);
}

	}

}
