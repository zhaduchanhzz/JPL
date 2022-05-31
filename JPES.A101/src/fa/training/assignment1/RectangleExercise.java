package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		sc.close();
		System.out.printf("Area is " + w + " * " + h + " = " + "%.2f \n", w * h);
		System.out.printf("Perimeter is 2 * (" + w + " + " + h + ") = " + "%.2f", (w + h) * 2);
	}

}
