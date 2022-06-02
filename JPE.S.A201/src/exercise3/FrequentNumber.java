package exercise3;

import java.util.Scanner;

public class FrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("En ther the length of array  ");
		int len = sc.nextInt();
		int[] intArray = new int[len];
		for (int i = 0; i < intArray.length; i++) {
			if (i > 0) {
				System.out.println("Do you want to continues(Y/N)  ");
				String choice = sc.next();
				if (choice.equalsIgnoreCase("N")) {
					break;
				} else if (choice.equalsIgnoreCase("Y")) {
					System.out.println("Enter element  " + (i + 1));
					intArray[i] = sc.nextInt();
				} else {
					System.out.println("pls enter Y/N  ");
				}
			} else {
				System.out.print("Enter element " + (i + 1)+"  ");
				intArray[i] = sc.nextInt();
			}

		}
		System.out.print("En ther Value to check result  ");
		int value = sc.nextInt();
		String result = " ";
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == value) {
				count++;
				result += i + " ";
			}
		}
		sc.close();
		System.out.println("Amount of frequence: "+ count +"\n Indexs:" +result);
		
	}

}
