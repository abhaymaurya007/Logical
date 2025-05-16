package Problem1;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,4};
		printElemrntOfArray(arr);
		printElemrntOfArray2(arr);
     System.out.println(Arrays.toString(arr));
	}
	public static void printElemrntOfArray(Integer arr[]) {
		for(Integer a:arr) {
			System.out.println(a);
		}
	}
	public static void printElemrntOfArray2(Integer arr[]) {
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("element is  "+arr[i]);
	    }
	}
	

}
