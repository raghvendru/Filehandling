package Practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class File_Read_Object {
	public static void getMarks(ArrayList<Student> al) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).marks>=40) {
				System.out.println("congrats!!!! u passed ");
			}else {
				System.out.println("sorry!! u failed");
			}
		}
		
	}
	public static void main(String[] args)  throws IOException, ClassNotFoundException{
		FileInputStream fs = new FileInputStream("object");
		ObjectInputStream os = new ObjectInputStream(fs);
		Student s;
		ArrayList<Student> al = new ArrayList<>();
		
		try {
			while((s = (Student) os.readObject()) !=null) {
				s.dispStud();
				al.add(s);

				getMarks(al);
				
				
			}
		}catch(EOFException e){
			System.out.println("exception caught");
		}
		
		
		
	}

}
