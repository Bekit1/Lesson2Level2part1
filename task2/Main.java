package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double xa;
		double ya;
		System.out.println("Input x and y coordinates of vertex A");
		xa = sc.nextDouble();
		ya = sc.nextDouble();
		double xb;
		double yb;
		System.out.println("Input x and y coordinates of vertex B");
		xb = sc.nextDouble();
		yb = sc.nextDouble();
		double xc;
		double yc;
		System.out.println("Input x and y coordinates of vertex C");
		xc = sc.nextDouble();
		yc = sc.nextDouble();
		double xd;
		double yd;
		System.out.println("Input x and y coordinates of point D");
		xd = sc.nextDouble();
		yd = sc.nextDouble();
		double s1 = (xa - xd) * (yb - ya) - (xb - xa) * (ya - yd);
		double s2 = (xb - xd) * (yc - yb) - (xc - xb) * (yb - yd);
		double s3 = (xc - xd) * (ya - yc) - (xa - xc) * (yc - yd);
		if ((s1 <= 0 && s2 <= 0 && s3 <= 0) || (s1 > 0 && s2 > 0 && s3 > 0)) {
			System.out.println("Point lies inside the triangle");
		} else {
			System.out.println("Point doesn`t lie inside the triangle");
		}
	}

}
