package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		System.out.println("Input x and y coordinates");
		x = sc.nextDouble();
		y = sc.nextDouble();
		double c = Math.sqrt(x * x + y * y);
		if (c <= 4) {
			System.out.println("Point lies inside the circle");
		} else {
			System.out.println("Point doesn`t lie inside the circle");
		}
	}

}
