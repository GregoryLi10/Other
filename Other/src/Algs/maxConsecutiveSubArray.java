package Algs;

import java.util.ArrayList;
import java.util.Arrays;

public class maxConsecutiveSubArray {

	public static void quadratic(int[] arr) {
		
	}
	
	public static Object[] kindoflinear(int[] arr) {
		if (arr.length==0) return null;
		ArrayList<Integer> temp1=new ArrayList<Integer>();
		ArrayList<Integer> temp2=new ArrayList<Integer>();
		int max=arr[0], curr=arr[0];
		temp1.add(arr[0]);
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>curr+arr[i]) {
				curr=arr[i];
				temp2=new ArrayList<Integer>();
				temp2.add(arr[i]);
			}
			else {
				curr+=arr[i];
				temp2.add(arr[i]);
			}
			if (curr>max) {
				max=curr;
				temp1=new ArrayList<Integer>();
				temp1.addAll(temp2);
			}
		}
		Object[] temp={"sum: "+max, "subarray: "+temp1};
		return temp;
	}
	
	public static void main (String[] args) {
		System.out.println(Arrays.toString(kindoflinear(new int[] {-13, -39, -17, -10, 11, 32, 1, 6, -24, -10, 34, -23, -33, 7, 22, 37, -15, 23, -36, 38, 16, -10, -24, -48, -1, -26, 14, 9, 46, 42, 32, -4, -43, 17, 31, -40, 43, -11, -14, -23, -33, -8, -44, 7, -37, 21, -22, 8, -27, -45})));
	}
}
