package exercise2;

import java.util.Scanner;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		String[] stringArray = new String[range];
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("Input element "+i);
			stringArray[i] = sc.next();
		}
		System.out.println("Input the string want to check in the array"); 
		String check = sc.next();
		boolean find = false;
		for (int i = 0; i < stringArray.length; i++) {
			if(stringArray[i].contains(check)) {
				find = true;
			}
		}
		if (find) {
			System.out.println(" Check "+check +" in Array: Contained!");
		}
		else {
			System.out.println(" Check "+check +" in Array: Not Contained!");
		}
		sc.close();
		
	}

}
