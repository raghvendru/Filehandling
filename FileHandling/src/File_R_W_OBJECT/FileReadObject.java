package File_R_W_OBJECT;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//import File_R_W_OBJECT.Student;

public class FileReadObject {
	
	public static void getRes(Student s) {
		if(s.marks>50) {
			System.out.println("Passed");
		}else {
			System.out.println("failed");
		}
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs  = new FileInputStream("obj");
		ObjectInputStream os = new ObjectInputStream(fs);
		
		
		Student s;
		ArrayList<Student> al = new ArrayList<>();
		try {
			while((s =(Student) os.readObject() )!= null) {
				s.dispStud();
				getRes(s);
				al.add(s);
			}
		}catch( EOFException e) {
			System.out.println("caught the exception");
		}
		
		for(Student s1:al) {
		s1.dispStud();
		}
		
		fs.close();
		os.close();
		
	}

}
