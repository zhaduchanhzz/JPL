package fa.training.assignment1;

import java.util.Scanner;

/**
 * @author zhadu
 *
 */
public class ArithmeticExercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 +" + "+ num2 +" = " + (num1 + num2) );
		System.out.println(num1 +" - "+ num2 +" = " + (num1 - num2) );
		System.out.println(num1 +" x "+ num2 +" = " + (num1 * num2) );
		System.out.println(num1 +" / "+ num2 +" = " + (num1 / num2) );
		System.out.println(num1 +" % "+ num2 +" = " + (num1 % num2) );


	}

}
