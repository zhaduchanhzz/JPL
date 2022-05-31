package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstnum = sc.nextInt();
		int secondnum = sc.nextInt();
		sc.close();
		if (firstnum < secondnum) {
			System.out.println(firstnum + "!=" + secondnum);
			System.out.println(firstnum + "<" + secondnum);
			System.out.println(firstnum + "<=" + secondnum);
		} else if (firstnum > secondnum) {
			System.out.println(firstnum + "!=" + secondnum);
			System.out.println(firstnum + ">" + secondnum);
			System.out.println(firstnum + ">=" + secondnum);
		}
		else {
			System.out.println(firstnum + "=" + secondnum); 
		}
	}

}
