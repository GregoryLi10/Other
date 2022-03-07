import java.util.Arrays;

public class Recursion {

	public static int sum(int n) {
		if (n==0) return 0;
		else return n+sum(n-1);
	}
	
	public static int gridPaths(int n, int m) {
		if (n==1||m==1) return 1;
		else return gridPaths(n, m-1)+gridPaths(n-1, m);
	}
	
	public static void main (String[] args) {
		long startTime = System.nanoTime();
		System.out.println(sum(150));
		System.out.println(gridPaths(15,15));
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration/1000000);
	}
}
