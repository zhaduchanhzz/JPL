package exercise4;

import java.lang.reflect.Array;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };

		System.out.print("Original Array: ");
		for (int i = 0; i < myIntArray.length; i++) {
			if (i < myIntArray.length - 1) {
				System.out.print(myIntArray[i] + ", ");
			} else {
				System.out.print(myIntArray[i]);
			}

		}
		System.out.print("\nReversed  Array: ");
		for (int i = myIntArray.length-1; i >= 0 ; i--) {
			if (i > 0) {
				System.out.print(myIntArray[i] + ", ");
			} else {
				System.out.print(myIntArray[i]);
			}

		}
	}

}
