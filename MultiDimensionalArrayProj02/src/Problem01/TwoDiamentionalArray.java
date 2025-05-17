package Problem01;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDiamentionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre size of array");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];

		System.out.println("Enter " + (size * size) + " elements into array");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		   printing array using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i] [j]+ " ");
			}
			System.out.println();
		}

//		printing array using for-each loop
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		printing array using Arrays.deepToString() method
		System.out.println(Arrays.deepToString(arr));

	}
}
