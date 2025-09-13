package Practice2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriteObj {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(1,"akash",30);
		Student s2 = new Student(2,"ragh",30);
		Student s3 = new Student(3,"ak",30);
		
		
		FileOutputStream fs = new FileOutputStream("obj");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(s1);
		os.writeObject(s2);
		os.writeObject(s3);
		
		System.out.println("obj saved into file");
		
		
	}

}
