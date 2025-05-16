package Problem2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Object[]arr = { 1, 10.5, "java", true, 'A', new Employee(1, "raj"), 2, 3, 4 };

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		for (Object obj : arr)
			System.out.println(obj);

		System.out.println(Arrays.toString(arr));

		int sum = 0;

		for (Object o : arr) {
			if (o instanceof Integer) {
				sum = sum + (int) o;
			}
		}
		System.out.println(sum);
	}

}
