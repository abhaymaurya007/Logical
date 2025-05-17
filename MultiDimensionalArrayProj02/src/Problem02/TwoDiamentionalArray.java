package Problem02;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDiamentionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//---> NOTE :
//---> for jagged array first diamention value is must but second diamentional value is not required.
//---> if we pass second diamentional value to the array manually then it is known as 2D array but not multidiamentional array.

		int arr[][] = new int[3][]; // <--- 2D jagged array

		arr[0] = new int[3]; // <--- creating new array on 0 index of size 3
		arr[1] = new int[4]; // <--- creating new array on 1 index of size 4
		arr[2] = new int[1]; // <--- creating new array on 2 index of size 1

		int l = arr[0].length + arr[1].length + arr[2].length; // <--- calculating length of jagged array

		System.out.println("Enter " + l + " Elements into array");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		   printing array using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i] + " ");
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


