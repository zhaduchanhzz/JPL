package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double rd = sc.nextDouble();
		sc.close();
		System.out.println(2*rd*Math.PI);
		System.out.println(rd*rd*Math.PI);
	}

}
