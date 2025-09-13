package Practice2;

public class Student {
int id;
String name ;
float marks;
public Student(int i,String n,float m) {
	this.id = i;
	this.name = n;
	this.marks = m;
}

public void dispStu() {
	System.out.println(id + name + marks);
}
}
