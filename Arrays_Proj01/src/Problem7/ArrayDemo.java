package Problem7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

//		for (int a[] : arr) {
//			for (int x : a) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}

		System.out.println(Arrays.deepToString(arr));
	}
}
