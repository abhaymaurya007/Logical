package Problem6;

import java.util.Arrays;

interface Shape { }

class Square implements Shape { }

class Circle implements Shape { }

public class ArrayDemo {

	public static void main(String[] args) {

		Shape arr[] = new Shape[2];
		arr[0] = new Square();
		arr[1] = new Circle();
		System.out.println(Arrays.toString(arr));
	}
}
