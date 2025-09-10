package File_R_W_String;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteSTring {
public static void main(String[] args) throws IOException {
	FileWriter f = new FileWriter("str");
	
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	f.write(str);
	f.close();
	System.out.println("file writing done");
	
}
}
