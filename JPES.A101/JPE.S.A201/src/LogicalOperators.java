import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input third number: ");
		int num3 = sc.nextInt();
		System.out.print("Input fouth number: ");
		int num4 = sc.nextInt();
		sc.close();
		if (num1 == num2 && num3 == num4 && num2 == num3) {
			System.out.println("Numbers are equal!");
		}
		else {
			System.out.println("Numbers are not equal!");
		}
	}

}
