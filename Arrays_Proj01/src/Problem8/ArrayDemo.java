package Problem8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][][] = { { { 1, 2, 3 }, { 4, 5 }, { 7 } } };

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				for (int k = 0; k < arr[i][j].length; k++) {
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//		}

		
//		for (int a[][] : arr) {
//			for (int b[] : a) {
//				for (int c : b) {
//					System.out.print(c + " ");
//				}
//				System.out.println();
//			}
//		}

		System.out.println(Arrays.deepToString(arr));
	}
}