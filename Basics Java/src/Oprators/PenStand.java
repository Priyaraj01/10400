package Oprators;
import java.util.Scanner;
public class PenStand {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Num of Pens:");
			 int x=sc.nextInt();
			 int max=5;
			 if(max>x)
			 {
			System.out.println("Add the Pens:"+max);

			 }
			 else
			 {
			System.out.println("Pen Stand is Full");
}
		}
	 }
}
