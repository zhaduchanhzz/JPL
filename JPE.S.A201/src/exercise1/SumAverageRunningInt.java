package exercise1;

import java.util.Scanner;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lowerbound = sc.nextInt();
		int upperbound = sc.nextInt();
		
		sc.close();
		System.out.println((double)(lowerbound+upperbound)/2);

	}

}
