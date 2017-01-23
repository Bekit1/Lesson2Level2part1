package task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Input 4-digit x:");
		x = sc.nextInt();
		int first = x / 1000;
		int second = (x % 1000) / 100;
		int third = (x % 1000) % 100 / 10;
		int fourth = (x % 1000) % 100 % 10;
		if ((first + second) == (third + fourth)) {
			System.out.println("This number is lucky number");
		} else {
			System.out.println("This number isn`t lucky number");
		}
	}

}
