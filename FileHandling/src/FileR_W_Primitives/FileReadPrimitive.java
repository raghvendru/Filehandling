package FileR_W_Primitives;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadPrimitive {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("prim");
		DataInputStream ds = new DataInputStream(fs);
		int n = ds.readInt();
		double s = ds.readDouble();
		float f = ds.readFloat();
		
		fs.close();
		ds.close();
		System.out.println(n );
		System.out.println(s );
		System.out.println(f );
	}
}
