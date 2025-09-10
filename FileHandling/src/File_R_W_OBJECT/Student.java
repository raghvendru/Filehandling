package File_R_W_OBJECT;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	int marks;
	public Student(int i,String n,int m) {
		this.id = i;
		this.name = n;
		this.marks = m;
		
	}
	public void dispStud() {
		System.out.println(id + name +marks);
	}

}
