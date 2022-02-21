package Other;

public class Logs {

	public static boolean divisibleBy4(int n) {
		return Math.log(n)/Math.log(4)%1==0;
	}
	
	public static void main (String[] args) {
		System.out.println(divisibleBy4(4));
	}
}
