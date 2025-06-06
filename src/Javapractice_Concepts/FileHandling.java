package Javapractice_Concepts;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
String path="C:\\Users//deep.jpg";
File fil= new File(path);
fil.createNewFile();
	}

}
