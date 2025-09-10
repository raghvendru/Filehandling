package File_R_W_OBJECT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriteObject {
public static void main(String[] args) throws IOException {
	Student s1 = new Student(1,"raghav",40);
	Student s2 = new Student(2,"raj",30);
	
	
	FileOutputStream fs  = new  FileOutputStream("obj");
	ObjectOutputStream os = new ObjectOutputStream(fs);
	os.writeObject(s1);
	os.writeObject(s2);
	
	System.out.println("writing is done");
	
	fs.close();
	os.close();
	
}
}
