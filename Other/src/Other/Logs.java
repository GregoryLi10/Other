package Other;

public class Logs {
	//runs in log of N instead of linear (counting with for loop)
	public static int lengthOfNum(int n) {
		return (int) (Math.log10(n)+1);
	}
	//similar but a bit faster than dividing until 1
	public static boolean divisibleBy4(int n) {
		return Math.log(n)/Math.log(4)%1==0;
	}
	
	public static void main (String[] args) {
		System.out.println(divisibleBy4(4));
		System.out.println(lengthOfNum(123));
	}
}
