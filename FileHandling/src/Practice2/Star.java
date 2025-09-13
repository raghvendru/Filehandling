package Practice2;

public class Star {
	public static void star(int n) {
		for(int i=1;i<=n;i++) {
			int st = 1;
			if(i%2 == 0) st = 0;
			
			for(int j=1;j<=i;j++) {
				System.out.print(st);
				st = 1-st;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		star(4);
	}
}
