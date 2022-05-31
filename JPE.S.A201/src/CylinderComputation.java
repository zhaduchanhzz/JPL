import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius");
		double radius = sc.nextDouble();
		System.out.print("Enter height");
		double height = sc.nextDouble();
		sc.close();
		double surfaceArea = 2* Math.PI * radius*height + 2*Math.PI*radius*radius;
		double baseArea  = radius* radius*Math.PI;
		double volume = radius* radius*Math.PI*height;
		
		System.out.println("Surface area = "+ surfaceArea);
		System.out.println("Base  area = "+ baseArea);
		System.out.println("Volume  = "+ volume);
	}

}
