public class ChildQueue {

	public static char atX(int n, int x) {
		return (char)(Math.abs(Math.pow(4,(int)(Math.log(x-0.1)/Math.log(4)))-x)/Math.pow(4,(int)(Math.log(x-0.1)/Math.log(4)))+97);
	}
	
	public static void main (String[] args) {
		System.out.println(atX(4,17)); 
	}
}
