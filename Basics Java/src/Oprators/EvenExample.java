package Oprators;

import java.util.Scanner;

public class EvenExample {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Age:");
			int Age=sc.nextInt();
			boolean Eligible= Age>18;
			System.out.println(Eligible);
		}
		

	}
}
