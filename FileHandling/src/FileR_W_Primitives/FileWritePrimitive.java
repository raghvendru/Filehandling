package FileR_W_Primitives;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class FileWritePrimitive {
public static void main(String[] args) throws IOException {
	FileOutputStream fs = new FileOutputStream("prim");
	DataOutputStream ds = new DataOutputStream(fs);
	Scanner sc = new Scanner(System.in);
	System.out.println("eneter primitive which u want to save into file");
	int n = sc.nextInt();
	ds.writeInt(n);
	System.out.println("eneter primitive which u want to save into file");
	double s = sc.nextDouble();
	ds.writeDouble(s);
	System.out.println("eneter primitive which u want to save into file");
	Float f = sc.nextFloat();
	ds.writeFloat(f);
	
	fs.close();
	ds.close();
	
	
	
	
}
}
