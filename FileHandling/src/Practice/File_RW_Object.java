package Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class File_RW_Object {
public static void main(String[] args)  throws IOException{
	Student s1 = new Student(1,"ragh",35);
	Student s2 = new Student(2,"ak",25);
	Student s3 = new Student(3,"raj",45);
	
	FileOutputStream fs = new FileOutputStream("object");
	ObjectOutputStream os = new ObjectOutputStream(fs);
	
	os.writeObject(s1);
	os.writeObject(s2);
	os.writeObject(s3);

	System.out.println("file writing done");
	
	fs.close();
	os.close();
}
}
