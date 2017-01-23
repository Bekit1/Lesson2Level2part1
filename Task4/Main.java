package Task4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Input 6-digit x:");
		x = sc.nextInt();
		int first = x / 100000;
		int second = (x % 100000) / 10000;
		int third = (x % 100000) % 10000 / 1000;
		int fourth = (x % 100000) % 10000 % 1000/100;
		int fifth = (x % 100000) % 10000 % 1000%100/10;
		int sixth = (x % 100000) % 10000 % 1000%100%10;
		if ((first==sixth)&&(second==fifth)&&(third==fourth)) {
			System.out.println("This number is palindrom");
		} else {
			System.out.println("This number isn`t palindrom");
		}
	}

}
