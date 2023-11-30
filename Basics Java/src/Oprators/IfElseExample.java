package Oprators;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the num:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
				if(x>y)
					{
			     System.out.println("x value is greaterthan to y");	
					}
				else if(y>z)
					{
				 System.out.println("y value is greaterthan z");
					}
				
				else
					{
				 System.out.println("greatest number is z");
					}
		}

			}

		
}
