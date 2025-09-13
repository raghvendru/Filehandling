package Practice2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReadObj {
	
	public static void getMarks(ArrayList<Student> s) {
		
		for(int i=0;i<s.size();i++) {
			if(s.get(i).marks>30) {
				System.out.println("passed");
			}else {
				System.out.println("failed");
			}
		}
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("obj");
		ObjectInputStream obj = new ObjectInputStream(fs);
		
		Student s;
		ArrayList<Student> al = new ArrayList<>();
		try {
			while((s = (Student) obj.readObject()) != null) {
				s.dispStu();
				getMarks(al);
			}
			
		}catch(EOFException e){
			System.out.println("exception caught");
		}
		
	}

}
