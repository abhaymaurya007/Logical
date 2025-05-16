package Problem3;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "raj", 10000);

		Employee e2 = new Employee(2, "rahul", 20000);

		Employee e3 = new Employee(3, "suraj", 30000);

		Employee arr[] = { e1, e2, e3, new Employee(4, "juber", 40000) };

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for (Employee s : arr) {
//			System.out.println(s);
//		}

		System.out.println(Arrays.toString(arr));
	}

}
