package Problem4;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Employee arr[] = new Employee[size];

//      reading elements and storing into the array 		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("<=== Enter " + (i + 1) + " record of Employee ===>");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			arr[i] = new Employee(id, name, sal);
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for (Employee s : arr) {
//			System.out.println(s);
//		}

		System.out.println(Arrays.toString(arr));
	}


}
