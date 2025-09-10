package File_R_W_String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadString {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("str");
	//read at a time(first character)
//	int ch = fr.read();
//	
//	System.out.println((char)ch);
//	
	
	//Read char by char
//	int ch1;
//	while((ch1 = fr.read())!=-1) {
//		System.out.print((char)ch1);
//	}
	
	//Buffer
	BufferedReader br = new BufferedReader(fr);
//	String str = br.readLine();
//	System.out.println(str);
//	String str1 = br.readLine();
//	System.out.println(str1);
	
	//OR
	String str;
	while((str=br.readLine())!=null) {
		System.out.println(str);
	}
}
}
